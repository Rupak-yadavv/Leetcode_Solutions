class Solution {
    public int largestRectangleArea(int[] heights) {
      int [] prefix = new int [heights.length];
      Stack <Integer> st = new Stack<>();
      for (int i =0;i<heights.length ;i++){
        while (!st.empty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if (st.empty()) prefix[i]=-1;
        else prefix[i]=st.peek();
        st.push(i);
      }
      st.clear(); 
      int sufix[] = new int [heights.length];
      for (int i =heights.length-1;i>=0 ;i--){
        while (!st.empty() && heights[st.peek()]>heights[i]){
            st.pop();
        }
        if (st.empty()) sufix[i]=heights.length;
        else sufix[i]=st.peek();
        st.push(i);
      }
      int max =0;
      for (int i =0;i<heights.length;i++){
        max = Math.max(max , heights[i]*(sufix[i] - prefix[i]-1));
      }
      return max ;
    
    }
}