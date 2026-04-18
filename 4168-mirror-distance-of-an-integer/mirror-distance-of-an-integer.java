class Solution {
    public int mirrorDistance(int n) {
          
      return Math.abs(n-fx(n));


        
       
    }
     static int fx(int x){
        int rev = 0;
       while(x!=0){
        int lastdigit = x%10;
            x = x/10;
            rev = (rev*10)+lastdigit;
       }
       return rev;
        }
}