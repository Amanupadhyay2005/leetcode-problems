class Solution {
    public int maxProduct(int x) {
        int max1 = 0;
        int max2 = 0;
        while(x != 0){
            int digit = x % 10;
            if(digit > max1){
                max2 = max1;
                max1 = digit;
            }
            else if (digit > max2){
                max2 = digit;
            }
            x = x/10;
        }
        return max1 * max2;
  }
}