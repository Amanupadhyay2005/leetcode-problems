class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<3) return nums.length;
        int j= 2;
        int length = 2;
        int max = 2;
        {
            while(j<nums.length){
                if(nums[j]==nums[j-1]+nums[j-2]){
                    length++;
                    max = Math.max(max,length);
                    j++;
                    
                }
                else if(nums[j]!=nums[j-1]+nums[j-2]) {

                    length = 2;
                 
                    j++;
                }
                
            }
        }
        return max;
    }
}