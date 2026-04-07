class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Move start pointer forward if not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } 
            // Move end pointer backward if not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } 
            // Both are alphanumeric, compare them
            else {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}