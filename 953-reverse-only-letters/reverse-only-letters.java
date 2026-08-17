class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = sb.length() - 1;

        while (l < r) {
            // Move left pointer until an English letter is found
            while (l < r && !Character.isLetter(sb.charAt(l))) {
                l++;
            }
            // Move right pointer until an English letter is found
            while (l < r && !Character.isLetter(sb.charAt(r))) {
                r--;
            }
            // Swap the letters in place
            if (l < r) {
                char temp = sb.charAt(l);
                sb.setCharAt(l, sb.charAt(r));
                sb.setCharAt(r, temp);
                l++;
                r--;
            }
        }

        return sb.toString();
    }
}