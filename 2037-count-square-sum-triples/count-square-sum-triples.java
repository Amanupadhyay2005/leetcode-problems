class Solution {
    public int countTriples(int n) {
        int count =0;
        for(int a = 1;a<=n;a++){
            for(int b = a+1;b<=n;b++){
            int i = a*a + b*b;
                double c = (int)Math.sqrt(i);
                if(c*c == i&& c<=n){
                     count +=2;
                }
            }
        }
        return count;
    }
}