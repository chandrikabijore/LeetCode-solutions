import java.util.Arrays;

public class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int m = k;
        int[][] dp = new int[110][110];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i && j <= m; j++) {
                int needRemove = 0;
                int groupCount = 0;
                dp[i][j] = Integer.MAX_VALUE;
                if (j > 0) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                for (int k = i; k >= 1; k--) {
                    if (s.charAt(k - 1) != s.charAt(i - 1)) {
                        needRemove++;
                    } else {
                        groupCount++;
                    }

                    if (needRemove > j) {
                        break;
                    }

                    if (groupCount == 1) {
                        dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - needRemove] + 1);
                    } else if (groupCount < 10) {
                        dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - needRemove] + 2);
                    } else if (groupCount < 100) {
                        dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - needRemove] + 3);
                    } else {
                        dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - needRemove] + 4);
                    }
                }
            }
        }

        return dp[n][m];
    }
}
