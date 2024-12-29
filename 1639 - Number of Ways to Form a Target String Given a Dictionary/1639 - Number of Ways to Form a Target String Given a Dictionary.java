class Solution {
    public static final int MOD=1000000007;
    public int numWays(String[] words, String target) {
        int n = words[0].length();
        int m = target.length();
        if (m > n) {
            return 0;
        }
        int[][] freq = new int[n][26];
        for (String s : words) {
            for (int i = 0; i < n; i++) {
                freq[i][s.charAt(i) - 'a']++;
            }
        }
        return f(n, m, target, freq,new Integer[n+1][m+1]);
    }

    int f(int i, int j, String target, int[][] freq,Integer[][] dp) {
        if( i < j ){
            return 0;
        }
        if (j == 0 ) {
            return 1;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        // choose
        int ch = 0, nc = 0;
        if (freq[i - 1][target.charAt(j - 1) - 'a'] != 0) {
            ch = (int)(((long)freq[i - 1][target.charAt(j - 1) - 'a'] * f(i - 1, j - 1, target, freq,dp))%MOD);
        }
        nc = f(i - 1, j, target, freq,dp);
        return dp[i][j]=(ch + nc)%MOD;

    }
}
