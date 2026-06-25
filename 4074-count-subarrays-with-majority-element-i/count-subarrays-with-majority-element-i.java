class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int totalSubarrays = 0;
        
        // Check every possible starting point
        for (int i = 0; i < nums.length; i++) {
            int targetCount = 0;
            int totalLength = 0;
            
            // Expand the subarray from index i to j
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    targetCount++;
                }
                totalLength++;
                
                // Majority element condition: strictly more than half
                if (targetCount > totalLength / 2) {
                    totalSubarrays++;
                }
            }
        }
        
        return totalSubarrays;
    }
}