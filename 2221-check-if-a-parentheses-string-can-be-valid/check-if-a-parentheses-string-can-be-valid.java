class Solution {
    public boolean canBeValid(String s, String locked) {
       if (s.length()%2!=0) return false ;
       int open =0;
       int close =0;
       int total =0;
       for (int i =s.length()-1;i>=0;i--){
        if (locked.charAt(i)=='0')total++;
        else if (s.charAt(i)=='(')open++;
        else if (s.charAt(i)==')')close++;
        if (total+close-open<0) return false ;
        }
        open =close =total=0;
        for (int i=0;i<s.length();i++){
         if (locked.charAt(i)=='0')total++;
        else if (s.charAt(i)=='(')open++;
        else if (s.charAt(i)==')')close++; 
         if (total-close+open<0) return false ;
       }
       return true ;
    }
}