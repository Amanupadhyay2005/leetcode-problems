class Solution {
    public int countSubstrings(String s) {
        String n = "";
       int count = 0;

        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                n = s.substring(i,j+1);
                 
                  if(ispalindrome(n)){
                    count++;
                  }

            }
        }
               
                 
                
        
        return count;
    }
    boolean ispalindrome(String n){
        int k = 0;
        int a = n.length()-1;
                    while(k<=a){
                    if(n.charAt(k)!=n.charAt(a)){
                        return false;
                    }
                    
                        k++;
                        a--;
                    
                    
                   
                }
                return true;
                 }
}