class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k = j+1;k<nums.length;k++){
                    if(nums[i]==nums[j]&&nums[j]==nums[k]){
                         int x = Math.abs(i-j)+ Math.abs(j-k)+ Math.abs(k-i);
                         min = Math.min(x,min);   
                         found = true;
                    } 
                    
                }
            } 
        }
      if(found){
        return min;
      }
      return -1;
        
    }
}