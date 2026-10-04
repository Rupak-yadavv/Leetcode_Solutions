class Solution {
    public int minRotations(String s) {
        int ans =0;
          char ch = '0';
    for (char c :s.toCharArray()){  
        int rev =Math.abs(c-ch);
        ans+=Math.min(rev , 10-rev);
        ch = c;
    }
    return ans ;    
    }
}