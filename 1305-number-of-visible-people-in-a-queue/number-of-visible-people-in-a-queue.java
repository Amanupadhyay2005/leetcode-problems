class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = 0;
        st.push(heights[n-1]);

        for(int i = n-2; i>=0;i--){
            int count = 0;
            while(st.size()>0 && st.peek()<=heights[i]){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;      // important step
            ans[i] = count;
            st.push(heights[i]);

        }
        return ans;
    }
}