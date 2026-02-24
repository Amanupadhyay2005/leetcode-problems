class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Build frequency for p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        for (int i = 0; i < s.length(); i++) {
            
            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove left character if window size exceeded
            if (i >= windowSize) {
                sCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}