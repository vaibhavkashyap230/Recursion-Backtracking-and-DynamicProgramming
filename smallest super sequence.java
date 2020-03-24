// https://classroom.codingninjas.com/app/classroom/me/1108/content/30560/offering/323433/problem/1441

public class Solution
{
	public static int smallestSuperSequence(String s1, String s2)
    {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=i;
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+1;
            }
        }
        return dp[s1.length()][s2.length()];
    }
}