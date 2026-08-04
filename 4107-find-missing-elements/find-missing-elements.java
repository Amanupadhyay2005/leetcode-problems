class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int j = 0;

        for (int i = nums[0] + 1; i < nums[nums.length - 1]; i++) {
            while (j < nums.length && nums[j] < i) {
                j++;
            }
            if (j < nums.length && nums[j] != i) {
                list.add(i);
            }
        }

        return list;
    }
}