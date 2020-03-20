// https://classroom.codingninjas.com/app/classroom/me/1108/content/30559/offering/323406/problem/852

public class Solution
{
	public static int countStepsTo1(int n)
    {
        if(n==1)
        {return 0;}
        if(n==2)
        {return 1;}
        if(n==3)
        {return 1;}
        
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        for(int i=4;i<n+1;i++)
        {
            int m1 = dp[i-1]+1;
            int m2 = Integer.MAX_VALUE;
            if(i%2==0)
            {
                m2 = dp[i/2]+1;
            }
            int m3 = Integer.MAX_VALUE;
            if(i%3==0)
            {
                m3 = dp[i/3]+1;
            }
            dp[i]=Math.min(m1,Math.min(m2,m3));
        }
        return dp[n];
	}
}