class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums){
            ans ^= num;    // XOR each number
        }
        return ans;
    }
}
