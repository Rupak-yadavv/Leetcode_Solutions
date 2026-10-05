class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        for (char ch : s.toCharArray()){
            if (ch=='(')  st.push(0);
            else{
                int index=st.pop();
                if (index==0) index=1;
                else index*=2;
                st.push(st.pop()+index);
            }
        }
        return st.pop();
    }
}