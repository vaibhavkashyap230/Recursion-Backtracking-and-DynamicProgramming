// https://practice.geeksforgeeks.org/problems/number-of-coins/0/

import java.util.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-->0)
	    {
	        int total = sc.nextInt(), size = sc.nextInt();
	        int a[] = new int[size];
	        for(int i=0;i<size;i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        int dp[][] = new int[size+1][total+1];
	        for(int i=0;i<=size;i++)
	        {
	            dp[i][0] = 0;
	        }
	        for(int i=1;i<=total;i++)
	        {
	            dp[0][i] = -1;
	        }
	        for(int i=1;i<=size;i++)
	        {
	            for(int j=1;j<=total;j++)
	            {
	                if(j<a[i-1])
	                    dp[i][j] = dp[i-1][j];
	               else
	               {
	                   if(dp[i-1][j]==-1 && dp[i][j-a[i-1]]==-1)
	                        dp[i][j] = -1;
	                   else if(dp[i-1][j]==-1 || dp[i][j-a[i-1]]==-1)
	                   {
	                       if(dp[i-1][j]==-1)
	                            dp[i][j] = 1 + dp[i][j-a[i-1]];
	                       else
	                            dp[i][j] = dp[i-1][j];
	                   }
	                   else
	                        dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-a[i-1]]);
	               }
	            }
	        }
	        System.out.println(dp[size][total]);
	    }
	}
}
