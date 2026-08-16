/*class Solution {
    public int uniquePaths(int m, int n) {
        
      return count(0, 0 ,m , n);
    }
   static int count(int row ,int column , int m , int n){
        if (row==m-1|| column==n-1){
            return 1;
        }
        int left = count(row+1 , column ,m , n);
        int right = count(row , column+1, m , n);
        return left +right ;
    }      //code is showing TLE but my codde  is correct it takes O(2^m+n) .

}*/
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int row = 0; row < m; row++) {
            dp[row][0] = 1;
        }

        for (int column = 0; column < n; column++) {
            dp[0][column] = 1;
        }

        for (int row = 1; row < m; row++) {
            for (int column = 1; column < n; column++) {
                dp[row][column] =
                    dp[row - 1][column] + dp[row][column - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}