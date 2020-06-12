// https://leetcode.com/problems/min-cost-climbing-stairs/

class Solution
{
    public int minCostClimbingStairs(int[] a)
    {
        int dp[] = new int[a.length+1];
        for(int i=2;i<dp.length;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i+1<dp.length)
                dp[i+1] = Math.min(dp[i+1],dp[i]+a[i]);
            if(i+2<dp.length)
                dp[i+2] = Math.min(dp[i+2],dp[i]+a[i]);
        }
        return dp[a.length];
    }
}
