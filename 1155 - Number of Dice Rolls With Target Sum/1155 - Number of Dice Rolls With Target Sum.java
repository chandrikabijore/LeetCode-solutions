class Solution {
    int mod = 1000000007; 
    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] dp = new Integer[n][target+1];
        return solution(n, k, target, dp);
    }

    private int solution(int n, int k, int target, Integer[][] dp){
        if(n==0 && target == 0) return 1; 
        if(target < 0 || n<=0) return 0; 
        if(dp[n-1][target] == null){
            int ans = 0; 
            for(int i=1; i<=k; i++){
                ans = (ans + solution(n-1, k, target-i, dp))%mod; 
            }
            dp[n-1][target] = ans;
        }
        return dp[n-1][target];
    }
}

