class Solution {

    public int countVowelPermutation(int n) {
        int MOD = 1000000007;
    
        // Create a 2D array to store the counts
        int[][] dp = new int[n + 1][5]; // 5 characters: a, e, i, o, u
    
        // Initialize the counts for strings of length 1
        for (int i = 0; i < 5; i++) {
            dp[1][i] = 1;
            }
    
        // Fill in the counts for strings of length 2 to n
        for (int len = 2; len <= n; len++) {
            dp[len][0] = (dp[len - 1][1] + dp[len - 1][2] + dp[len - 1][4]) % MOD; // a
            dp[len][1] = (dp[len - 1][0] + dp[len - 1][2]) % MOD; // e
            dp[len][2] = (dp[len - 1][1] + dp[len - 1][3]) % MOD; // i
            dp[len][3] = (dp[len - 1][2]) % MOD; // o
            dp[len][4] = (dp[len - 1][2] + dp[len - 1][3]) % MOD; // u
        }
    
        // Calculate the total count for strings of length n
        int totalCount = 0;
        for (int i = 0; i < 5; i++) {
            totalCount = (totalCount + dp[n][i]) % MOD;
        } 
            
        return totalCount;
    }
}
