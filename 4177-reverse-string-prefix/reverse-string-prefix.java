class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder str = new StringBuilder(s);
       int i = 0,j = k-1;
       while(i<=j){
        char temp = str.charAt(i);
        char temp2 = str.charAt(j);
        str.setCharAt(i,temp2);
        str.setCharAt(j,temp);
        i++;
        j--;

       }
       return str.toString();
    }
}