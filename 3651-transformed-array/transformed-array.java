class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int []arr = new int[nums.length];
        for(int  i =0;i<nums.length;i++){
            int shift = nums[i]%n;
            
             int newinx = (i+shift)%n;
             if(newinx<0){
                newinx += n;
             }
             arr[i]= nums[newinx];
        }
       
        return arr;
    }
}