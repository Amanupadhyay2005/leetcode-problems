class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<3) return nums.length;
       
        int length = 2;
        int max = 2;
        
           for(int j = 2;j<nums.length;j++){
                if(nums[j]==nums[j-1]+nums[j-2]){
                    length++;
                    max = Math.max(max,length);   
                }
                else if(nums[j]!=nums[j-1]+nums[j-2]) {
                   length = 2; 
            }
        }
        return max;
    }
}