class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 1;
        int j = arr.length-2;
        int mid=-1;
        while(i<=j){
             mid = (i+j)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                 i =mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return mid;
    }
}