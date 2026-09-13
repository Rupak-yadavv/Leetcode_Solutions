class Solution {
    public int minSteps(String s, String t) {
        int [] fre = new int [26];
        for (char ch : s.toCharArray()){
            fre[ch-'a']++;
        }
        int count =0;
        for (char ch :t.toCharArray()){
            if (fre[ch-'a']>0){
                fre[ch-'a']--;
            }else 
            count++;
        }
        return count ;
    }
}