// https://leetcode.com/problems/minimum-falling-path-sum/submissions/

class Solution
{
    public int minFallingPathSum(int[][] a)
    {
    	  int n = a.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
          dp[0][i]=a[0][i];
        }
        for(int i=1;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            int a1=Integer.MAX_VALUE,b,c=Integer.MAX_VALUE;

            if(j-1>=0)
              a1=dp[i-1][j-1];

            if(j+1<n)
              c=dp[i-1][j+1];
            b=dp[i-1][j];
            dp[i][j] = a[i][j] + Math.min(a1,Math.min(b,c));
          }
      }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
          if(dp[n-1][i]<min)
            min = dp[n-1][i];
        }
        return min;
    }
}
