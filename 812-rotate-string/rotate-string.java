class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder str = new StringBuilder(s+s);
        for(int i = 0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                if(goal.equals(str.substring(i,j))){
                    return true;
                }
            }
        }
        
        return false;
    }
}