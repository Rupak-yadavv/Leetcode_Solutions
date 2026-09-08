class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int [] fre  = new int [26];
     int left = 0;
     int maxf = 0;
     int max =0 ; 
     for (int right =0;right<s.length();right++){
          fre[s.charAt(right)-'A']++;
          maxf = Math.max(maxf , fre[s.charAt(right)-'A']);

        while ((right-left+1)-maxf>k){
           fre[s.charAt(left)-'A']--;
            left++;
        }
        max = Math.max(max , right-left+1);
     }  
     return max ; 
    }
}