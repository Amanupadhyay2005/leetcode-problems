class Solution {
    public int thirdMax(int[] nums) {
        int temp = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int arr[] = new int[set.size()];
        int k = 0;
        for(int x : set){
            arr[k++] = x;
        }

        
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
             if(arr[j] < arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
             }

            }
        }
         if(arr.length>2){
            return arr[2];
         }
    return arr[0];

    }
}