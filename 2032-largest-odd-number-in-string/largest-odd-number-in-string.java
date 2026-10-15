class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder(num);
        int i =num.length()-1;
        while (i>=0){
            char ch =num.charAt(i);
            if ((ch-'0')%2!=0){
                return ans.toString() ;
            }else {
                ans.deleteCharAt(i);
                i--;
            }
        }
        return ans.toString()  ;
    }
}