// https://practice.geeksforgeeks.org/problems/cutted-segments/0

import java.util.*;

public class GFG
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    while(test-->0)
	    {
	        int l = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int dp[] = new int[l+1];
            if(a<=l)
        	dp[a] = 1;
            if(b<=l)
        	dp[b] = 1;
            if(c<=l)
        	dp[c] = 1;
        
            for(int i=0;i<=l;i++)
            {
                if(dp[i]==0)
                    continue;
            
                if(i+a<=l)
                {
                    dp[i+a] = Math.max(dp[i]+1,dp[i+a]);
                }
                if(i+b<=l)
                {
                dp[i+b] = Math.max(dp[i]+1,dp[i+b]);
                }
                if(i+c<=l)
                {
                    dp[i+c] = Math.max(dp[i]+1,dp[i+c]);
                }
            }
            System.out.println(dp[l]);
	    }
	}
}