class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        int mul =1;
        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
             mul = (i+1)*(26-(ch-'a'));
            sum+=mul;
        }
        return sum ;
    }
}