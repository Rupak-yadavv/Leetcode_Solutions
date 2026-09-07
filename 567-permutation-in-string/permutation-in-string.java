class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int [] fre1= new int [26];
    int [] fre2  = new int [26];
    int left =0;
    int k = s1.length();
    for (int i =0;i<s1.length ();i++){
        fre1[s1.charAt(i)-'a']++;
    }  
    for(int right =0;right<s2.length();right++){
       fre2[s2.charAt(right)-'a']++;
        if (right-left+1==k){
      if (Arrays.equals(fre1 , fre2)){
        return true ;
      }

        fre2[s2.charAt(left)-'a']--;
            left++;
        }
    }
    return false;
    }
}