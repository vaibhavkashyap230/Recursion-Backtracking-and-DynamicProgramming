// https://classroom.codingninjas.com/app/classroom/me/1108/content/30560/offering/323433/problem/1436

public class Solution
{	
	public static int findMaxSquareWithAllZeros(int[][] a)
    {
        int max = 0;
        int dp[][] = new int[a.length+1][a[0].length+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
                if(a[i-1][j-1]==1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = 1 + Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]));
                
                if(dp[i][j]>max)
                    max = dp[i][j];
            }
        }
        return max;
	}
}