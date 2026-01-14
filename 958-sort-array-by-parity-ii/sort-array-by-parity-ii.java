class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0; // even index
        int j = 1; // odd index
        int n = nums.length;

        while (i < n && j < n) {
            // correct even index
            if (nums[i] % 2 == 0) {
                i += 2;
                continue;
            }

            // correct odd index
            if (nums[j] % 2 == 1) {
                j += 2;
                continue;
            }

            // swap wrong positions
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i += 2;
            j += 2;
        }
        return nums;
    }
}
