class Solution {
    public boolean isAnagram(String s, String t) {   
        if (s.length()!=t.length()){
            return false ;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
    for (int i=0;i<s.length();i++){
      char ch1= s.charAt(i);
      char ch2 = t.charAt(i);
      freq1[ch1]++;
      freq2[ch2]++;
    }
    for (int i=0;i<256; i++){
        if( freq1[i]!=freq2[i]){
            return false ;
        }
    }
    return true ; 
       
    }  
}