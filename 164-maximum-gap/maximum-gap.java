class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        int i = 0,j = 1;
        int maxgap = Integer.MIN_VALUE; 
        while(j<nums.length){
            
                int max = (nums[j]-nums[i]);
                maxgap = Math.max(maxgap,max);
                i++;
                j++;
            
           
        }
        return maxgap;
    }
}