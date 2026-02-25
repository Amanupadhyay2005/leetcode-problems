class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);

            if (bitA == bitB) {
                return a - b;   // sort by value if same bit count
            }
            return bitA - bitB; // sort by bit count
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }

        return arr;
    }
}