// https://leetcode.com/problems/coin-change/

class Solution
{
    public int coinChange(int[] coins, int amount)
    {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int i=1;i<=amount;i++)
        {
            dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<=coins.length;i++)
        {
            dp[i][0] = 0;
        }
        for(int i=1;i<=coins.length;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(j<coins[i-1])
                    dp[i][j] = dp[i-1][j];
                else
                {
                    int opt1 = dp[i-1][j], opt2 = dp[i][j-coins[i-1]];
                    
                    if(opt1==Integer.MAX_VALUE && opt2==Integer.MAX_VALUE)
                        dp[i][j] = Integer.MAX_VALUE;
                    else if(opt1!=Integer.MAX_VALUE && opt2!=Integer.MAX_VALUE)
                        dp[i][j] = Math.min(opt1,1+opt2);
                    else if(opt1==Integer.MAX_VALUE && opt2!=Integer.MAX_VALUE)
                        dp[i][j] = opt2 + 1;
                    else
                        dp[i][j] = opt1;
                }
            }
        }
        if(dp[coins.length][amount]==Integer.MAX_VALUE)
            return -1;
        return dp[coins.length][amount];
    }
}
