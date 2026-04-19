class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
       int i = 0,j= 0;
       boolean found = false;
       int max = 0;
       while(i<nums1.length&&j<nums2.length){
        if(nums2[j]>=nums1[i]){
          found = true;
            max = Math.max(max,j-i);
            j++;
        }
        else{
           i++;
        }
        
       }
       if(found){
        return max;
      }
       
       return max;
    }
}