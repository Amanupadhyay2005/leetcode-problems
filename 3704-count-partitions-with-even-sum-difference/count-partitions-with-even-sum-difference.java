class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int x : nums) total += x;

        int prefix = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            prefix += nums[i];
            int suffix = total - prefix;

            if ((prefix - suffix) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
