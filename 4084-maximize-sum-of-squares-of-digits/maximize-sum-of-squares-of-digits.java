class Solution {
    public String maxSumOfSquares(int num, int sum) {

    //     String ans = "";
    //     while (num-->0){
    //         if (sum>=9){
    //             ans+='9';
    //             sum-=9;
    //         }
    //         else {
    //             ans+=String.valueOf(sum);
    //             sum=0;
    //         }
    //     }
    //     if (sum>0) return "";
    //     return ans.toString();
    // }
    StringBuilder ans = new StringBuilder();
        while (num-->0){
            if (sum>=9){
                ans.append(9);
                sum-=9;
            }
            else {
                ans.append(sum);
                sum=0;
            }
        }
        if (sum>0) return "";
        return ans.toString();
    }
}