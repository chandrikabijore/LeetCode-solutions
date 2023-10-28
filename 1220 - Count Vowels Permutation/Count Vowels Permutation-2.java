class Solution 
{
    int MOD = 1000000007;
    public int countVowelPermutation(int n) 
    {
        long a=1, e=1, i=1, o=1, u=1;
        for(int j=1; j<n; j++)
        {
            long a_nxt = (e)%MOD;
            long e_nxt = (a+i)%MOD;
            long i_nxt = (a+e+o+u)%MOD;
            long o_nxt = (i+u)%MOD;
            long u_nxt = a;

            a = a_nxt;
            e = e_nxt;
            i = i_nxt;
            o = o_nxt;
            u = u_nxt;
        }
        
        return (int)((a+e+i+o+u)%MOD);
    }
}
