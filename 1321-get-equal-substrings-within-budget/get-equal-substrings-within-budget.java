class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
      int left =0;
      int max =0;
      int cost =0;
      for (int right =0;right<s.length();right++){
         cost =cost +Math.abs((s.charAt(right)-'a')-(t.charAt(right)-'a'));
        while (cost >maxCost){
        cost =cost -Math.abs((s.charAt(left)-'a')-(t.charAt(left)-'a'));
         left++;
        }
        max = Math.max(right-left+1 , max);
      }
      return max ;
       
    }
}