class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int x  = 1;x<=n;x++){
            if(!(set.contains(x))){
                list.add(x);
            }
        }
        return list;
    }
}