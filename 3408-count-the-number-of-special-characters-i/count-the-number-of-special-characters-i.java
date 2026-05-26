import java.util.HashSet;

class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lowercaseSet = new HashSet<>();
        HashSet<Character> uppercaseSet = new HashSet<>();
        
        // Step 1: Populate both sets
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowercaseSet.add(ch);
            } else {
                uppercaseSet.add(ch);
            }
        }
        
        int count = 0;
        
        // Step 2: Count how many lowercase letters have an uppercase partner
        for (char ch : lowercaseSet) {
            // Convert the lowercase char to uppercase to check if it exists in the uppercase set
            if (uppercaseSet.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }
        
        return count;
    }
}