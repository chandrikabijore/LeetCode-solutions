class Solution {

    public int kInversePairs(int n, int k) {
        final int MOD = 1000000007;
        
        int[][] dp = new int[n + 1][k + 1];

     
        dp[1][0] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j <= k; ++j) {
                for (int p = 0; p <= Math.min(j, i - 1); ++p) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - p]) % MOD;
                }
            }
        }

        return dp[n][k];
    }
}
