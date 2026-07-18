class Solution {
    public int calPoints(String[] opt) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<opt.length;i++){
            String ch = opt[i];
            if(ch.equals("+")){
                int top1 = st.pop();
                int top2 = st.pop();
                int sum = top1 + top2;
                st.push(top2);
                st.push(top1);
                st.push(sum);
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else if(ch.equals("D")){
                int top = st.peek() * 2;
                 st.push(top);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
           

        }

        int total = 0;
        while(st.size()>0){
            total = total + st.pop();
        }
        return total;
    }
}