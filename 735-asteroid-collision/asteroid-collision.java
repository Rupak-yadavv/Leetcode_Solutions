class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer > st = new Stack<>();
        for (int current : asteroids ){
             boolean b = false ;
             while (!st.empty() && st.peek()>0 && current<0){
                if (st.peek()<-current){
                  st.pop();
                }
                else if (st.peek()==-current){
                    st.pop();
                    b=true;
                    break;
                }else {
                    b=true;
                    break;
                }
             }
             if(!b){
                st.push(current);
             }
        }
         int [] ans = new int[st.size()];
         for (int i =0;i<st.size();i++){
            ans[i]=st.get(i);
           }
        return ans;
   }
}