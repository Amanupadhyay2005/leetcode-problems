class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
       for(int x : nums){
        sum = sum +x;
       } 
       if(sum % k==0 ){
        return 0;
       }
       int rem = sum % k;
         
         return rem;
         
        
    }
}