// https://classroom.codingninjas.com/app/classroom/me/1108/content/30559/offering/323413/problem/521

public class solution
{
	public  String solve(int n,int x,int y)
    {
        if(n==0)
        {
            return "Whis";
        }
        if(n==1 || n==x || n==y)
        {
            return "Beerus";
        }
        boolean dp[] = new boolean[n+1];
        dp[0]=false;
        for(int i=1;i<=n;i++)
        {
            if(dp[i-1]==false)
                dp[i]=true;
            else if(i-x>=0 && dp[i-x]==false)
                dp[i]=true;
            else if(i-y>=0 && dp[i-y]==false)
                dp[i]=true;
            else
                dp[i]=false;
        }
        if(dp[n]==true)
            return "Beerus";
        else
            return "Whis";
	}
}