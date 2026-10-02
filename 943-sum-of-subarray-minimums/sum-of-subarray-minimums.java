class Solution {
    public int sumSubarrayMins(int[] arr) {
     int [] prefix = new int [arr.length];
      Stack<Integer> st = new Stack<>();
      for (int i =0;i<arr.length ;i++){
        while (!st.empty() && arr[st.peek()]>=arr[i]){
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
      int sufix[] =new int [arr.length];
      for (int i =arr.length-1;i>=0;i--){
        while (!st.empty() && arr[st.peek()]>arr[i]){
            st.pop();
        }
        if (st.empty())  sufix[i]= arr.length;
        else sufix[i]=st.peek();
        st.push(i);
      }
      long total =0;
      for (int i =0;i<arr.length;i++){
        long left = i-prefix[i];
        long right = sufix[i]-i;
        total  += (right*left)*arr[i];
      }
      return (int) (total%1000000007) ;

    }
}