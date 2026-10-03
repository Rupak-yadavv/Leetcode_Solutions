class Solution {
    public int longestValidParentheses(String s) {
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        char ch [] = s.toCharArray();
        int max =0;
        for (int i =0;i<ch.length ;i++){ 
             if (ch[i]=='(')  st.push(i); 
             else {st.pop();  
              if (st.empty() ){
                    st.push(i);
                }
                else 
                 max = Math.max(max , i -st.peek());
             }         
        }
        return max ;
        
    }
}