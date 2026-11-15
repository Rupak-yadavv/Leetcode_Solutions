class Solution {
    public boolean isBalanced(String num) {
     int sumeven =0;
     int sumodd= 0;
     for (int i =0;i<num.length();i++) {
        char ch = num.charAt(i);
        if(i%2!=0) sumodd+=(ch-'0');
        else sumeven+=(ch-'0');
     }
     return (sumeven!=sumodd)?false:true;
    }
}