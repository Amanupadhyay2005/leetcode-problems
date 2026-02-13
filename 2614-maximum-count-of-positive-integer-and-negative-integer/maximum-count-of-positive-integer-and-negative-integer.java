class Solution {
    public int maximumCount(int[] nums) {
        int countpos = 0,countneg = 0;
           for (int i = 0;i<nums.length;i++){
                 if(nums[i]>0){
                    countpos++;
                 }
                 else if(nums[i]<0){
                    countneg++;
                 }
                 
           }
           return Math.max(countpos,countneg);
 }

}