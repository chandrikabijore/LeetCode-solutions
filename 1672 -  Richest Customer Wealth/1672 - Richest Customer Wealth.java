class Solution 
{
    public static int maximumWealth(int[][] accounts)
    {
        int ans=0;
        for (int person = 0; person < accounts.length; person++)
        {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++)
            {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
