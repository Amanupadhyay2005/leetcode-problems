import java.util.*;

class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {

        // Sort events:
        events.sort((a, b) -> {
            int t1 = Integer.parseInt(a.get(1));
            int t2 = Integer.parseInt(b.get(1));
            if (t1 != t2) return t1 - t2;
            return a.get(0).equals("OFFLINE") ? -1 : 1;
        });

        int[] mentions = new int[numberOfUsers];
        boolean[] online = new boolean[numberOfUsers];
        Arrays.fill(online, true);

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);

        int allCount = 0;

        for (List<String> e : events) {
            String eventType = e.get(0);
            int timestamp = Integer.parseInt(e.get(1));

            // Bring users back online if their offline time expired
            while (!pq.isEmpty() && pq.peek()[0] <= timestamp) {
                int[] top = pq.poll();
                online[top[1]] = true;
            }

            if (eventType.equals("OFFLINE")) {
                int user = parseUser(e.get(2));   // <-- FIX HERE
                online[user] = false;
                pq.add(new int[]{timestamp + 60, user});
            } else { // MESSAGE
                String msg = e.get(2);

                if (msg.equals("ALL")) {
                    allCount++;
                }
                else if (msg.equals("HERE")) {
                    for (int u = 0; u < numberOfUsers; u++) {
                        if (online[u]) mentions[u]++;
                    }
                }
                else {
                    // msg is like "id1 id4 id2"
                    String[] parts = msg.split(" ");
                    for (String p : parts) {
                        int user = parseUser(p);     // <-- FIX HERE
                        mentions[user]++;
                    }
                }
            }
        }

        // Add ALL mention count
        for (int i = 0; i < numberOfUsers; i++) {
            mentions[i] += allCount;
        }

        return mentions;
    }

    // Converts "id3" → 3
    private int parseUser(String s) {
        if (s.startsWith("id")) {
            return Integer.parseInt(s.substring(2));
        }
        return Integer.parseInt(s); // fallback
    }
}
