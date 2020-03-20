// https://classroom.codingninjas.com/app/classroom/me/1108/content/30559/offering/323409/problem/1442

public class Solution
{
    private static int mc(int n,int dp[])
    {
        if(dp[n]!=-1)
            return dp[n];
        
        int a=(int)(Math.sqrt(n));
        if(a*a==n)
        {
            dp[n]=1;
            return 1;
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
            int d;
            int v=n-(i*i);
            if(dp[v]!=-1)
                d=1+dp[v];
            else
            {
                d = mc(n-(i*i),dp);
                dp[v]=d;
                d+=1;
            }
            if(d<min)
                min=d;
        }
        return min;
    }
	public static int minCount(int n)
    {
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
        return mc(n,dp);
	}
}