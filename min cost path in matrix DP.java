// https://classroom.codingninjas.com/app/classroom/me/1108/content/30560/offering/323415/problem/1674

public class Solution
{
	public static int minCostPath(int m[][])
    {
        int dp[][] = new int[m.length+1][m[0].length+1];
        for(int i=0;i<dp[0].length;i++)
        {
            dp[dp.length-1][i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<dp.length;i++)
        {
            dp[i][dp[0].length-1]=Integer.MAX_VALUE;
        }
        
        for(int i=m.length-1;i>=0;i--)
        {
            for(int j=m[0].length-1;j>=0;j--)
            {
                if(i==m.length-1 && j==m[0].length-1)
                {
                    dp[i][j]=m[i][j];
                }
                else
                {
                    dp[i][j]=m[i][j]+Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]));
                }
            }
        }
        return dp[0][0];
	}
}