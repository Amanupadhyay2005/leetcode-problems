class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;

          while(i<s.length()){
            char ch = s.charAt(i);
            if(st.size()==0)  st.push(ch);
             else{
            char top = st.peek();
             if(top==ch){
                st.pop();
             }
             else{
                st.push(ch);
             }
            
             }
             i++;
           }
          StringBuilder str = new StringBuilder();
         while(st.size()>0){
            char top = st.pop();
             str = str.append(top);
         }

         return str.reverse().toString();
    } 
}
