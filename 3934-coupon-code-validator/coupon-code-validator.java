import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        // business line priority
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        List<Pair> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            // check active
            if (!isActive[i]) continue;

            // check business line
            if (!priority.containsKey(businessLine[i])) continue;

            // check code validity
            if (!isValidCode(code[i])) continue;

            validCoupons.add(new Pair(priority.get(businessLine[i]), code[i]));
        }

        // sort by business line order, then by code
        Collections.sort(validCoupons, (a, b) -> {
            if (a.order != b.order)
                return a.order - b.order;
            return a.code.compareTo(b.code);
        });

        // extract codes
        List<String> result = new ArrayList<>();
        for (Pair p : validCoupons) {
            result.add(p.code);
        }

        return result;
    }

    // helper method to validate code
    private boolean isValidCode(String s) {
        if (s == null || s.length() == 0) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }

    // helper class
    static class Pair {
        int order;
        String code;

        Pair(int order, String code) {
            this.order = order;
            this.code = code;
        }
    }
}
