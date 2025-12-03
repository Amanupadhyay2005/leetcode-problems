class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        if(set.contains(target)){
            return true;
        }
        return false;
        
    }
}