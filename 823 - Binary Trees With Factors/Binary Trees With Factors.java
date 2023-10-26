import java.util.Arrays;
public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        long[] dp = new long[n];
        Arrays.sort(arr);

        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int factor = arr[i] / arr[j];
                    int factorIndex = Arrays.binarySearch(arr, factor);
                    if (factorIndex >= 0) {
                        dp[i] += dp[j] * dp[factorIndex];
                        dp[i] %= mod;
                    }
                }
            }
        }

        long total = 0;
        for (long count : dp) {
            total += count;
        }

        return (int) (total % mod);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {2, 4};
        int[] arr2 = {2, 4, 5, 10};
        System.out.println(solution.numFactoredBinaryTrees(arr1)); // Output: 3
        System.out.println(solution.numFactoredBinaryTrees(arr2)); // Output: 7
    }
}
