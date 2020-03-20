// https://classroom.codingninjas.com/app/classroom/me/1108/content/30559/offering/323413/problem/1678

public class Solution
{
	public static int getMaxMoney(int a[], int n)
    {
        int dp[] = new int[n+1];
        dp[1]=a[0];
        for(int i=2;i<=n;i++)
        {
            if(dp[i-1]-a[i-2]>dp[i-2])
                dp[i]=dp[i-1]-a[i-2]+a[i-1];
            else
                dp[i]=dp[i-2]+a[i-1];
        }
        int min=dp[0];
        for(int i : dp)
        {
            if(i>min)
                min=i;
        }
        return min;
	}
}