class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = nums.get(i);
            int found = -1;

            // x can never be >= val
            for (int x = 0; x < val; x++) {
                if ( (x | (x + 1)) == val ) {
                    found = x;
                    break; // minimum x found
                }
            }
            ans[i] = found;
        }
        return ans;
    }
}
