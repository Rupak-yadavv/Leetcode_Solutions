class Solution {
    public String removeOuterParentheses(String s) {
       Stack <Character > st =new Stack<>();
       StringBuilder sb = new StringBuilder();
       for (int i=0;i<s.length()-1;i++){
        if (s.charAt(i)=='('){
            if (!st.empty())sb.append(s.charAt(i));
             st.push(s.charAt(i));
        }
        else{
            st.pop();
            if (!st.empty()) sb.append(s.charAt(i));
        }
       }   
       return sb.toString() ;
    }
}