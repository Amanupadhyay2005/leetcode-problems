class Solution {
    public int dominantIndex(int[] nums) {
        
        int arr[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i]= nums[i];
        }
        Arrays.sort(arr);
        if (arr[arr.length-1]< arr[arr.length-2]*2){
               return -1;
        }
         
       for(int i = 0;i<nums.length;i++){
        if(arr[arr.length-1]==nums[i]){
            return i;
        }
       }
       return -1;
    }
}