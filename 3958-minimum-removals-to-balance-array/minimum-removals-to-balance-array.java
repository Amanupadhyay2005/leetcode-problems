class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0,j = 0,l = 1,n= nums.length;
        while(i<=j&&j<n){
            if(nums[j]>(long)nums[i]*k){
                i++;
            }
            l = Math.max(l,j-i+1);
            j++;
        }
        return n-l;
        
    }
}
        
       