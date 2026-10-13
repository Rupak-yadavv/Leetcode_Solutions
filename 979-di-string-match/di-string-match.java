class Solution {
    public int[] diStringMatch(String s) {
      int ans[]= new int[s.length()+1];
      int left =0;
      int right=ans.length-1; 
      int i=0;
      while(i<s.length()){
        if (s.charAt(i)=='I'){
            ans[i]=left;
            left++;
           }
         else if (s.charAt(i)=='D'){
              ans[i]=right;
              right--;
            }
            i++;
        }
        if (s.charAt(s.length()-1)=='D') ans[i]=right;
        else if (s.charAt(s.length()-1)=='I') ans[i]=left;
    return ans ;
    }
}