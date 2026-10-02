class Solution {
    public long subArrayRanges(int[] nums) {
       int [] prefix = new int [nums.length];
      Stack<Integer> st = new Stack<>();
      for (int i =0;i<nums.length ;i++){
        while (!st.empty() && nums[st.peek()]>=nums[i]){
            st.pop();
        }
        if (st.empty()){
            prefix[i]=-1;
        }else {
            prefix[i]=st.peek();
        }
        st.push(i);
      }
      st.clear();
      int sufix[] =new int [nums.length];
      for (int i =nums.length-1;i>=0;i--){
        while (!st.empty() && nums[st.peek()]>nums[i]){
            st.pop();
        }
        if (st.empty())  sufix[i]= nums.length;
        else sufix[i]=st.peek();
        st.push(i);
      }
      st.clear();
      long totalmin =0;
      for (int i =0;i<nums.length;i++){
        long left = i-prefix[i];
        long right = sufix[i]-i;
        totalmin  += (right*left)*nums[i];
      } 
      int prefixmax []= new int [nums.length];
       for (int i =0;i<nums.length ;i++){
        while (!st.empty() && nums[st.peek()]<=nums[i]){
            st.pop();
        }
        if (st.empty()){
            prefixmax[i]=-1;
        }else {
            prefixmax[i]=st.peek();
        }
        st.push(i);
      }
      st.clear();
      int sufixmax[] =new int [nums.length];
      for (int i =nums.length-1;i>=0;i--){
        while (!st.empty() && nums[st.peek()]<nums[i]){
            st.pop();
        }
        if (st.empty())  sufixmax[i]= nums.length;
        else sufixmax[i]=st.peek();
        st.push(i);
      }
       long totalmax =0;
      for (int i =0;i<nums.length;i++){
        long left = i-prefixmax[i];
        long right = sufixmax[i]-i;
        totalmax += (right*left)*nums[i];
      } 
      return totalmax-totalmin;
    }
}