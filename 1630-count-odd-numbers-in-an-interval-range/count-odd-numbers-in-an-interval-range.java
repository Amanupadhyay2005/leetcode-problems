class Solution {
    public int countOdds(int low, int high) {
         int count = (high - low) / 2 + 1;

        // When both low and high are even 
        if(low % 2 == 0 && high % 2 == 0) 
            return count - 1;

        return count;
        
    }
}