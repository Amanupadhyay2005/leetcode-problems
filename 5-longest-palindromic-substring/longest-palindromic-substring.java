class Solution {
    public String longestPalindrome(String s) {
          
          int maxl = Integer.MIN_VALUE;
          String p="";
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String n  = s.substring(i,j+1);
                if(ispalindrome(n)&& n.length()>maxl){
                    maxl = n.length();
                   p = n;
                }
            }
        }
                return p;
                
    }

    boolean ispalindrome(String n){
        int i = 0;
        int j = n.length()-1;
       
        while(i<j){
            if(n.charAt(i)!=n.charAt(j)){
           return false;
        }
        i++;
        j--;
        }
        

        return true;
    }
    
}