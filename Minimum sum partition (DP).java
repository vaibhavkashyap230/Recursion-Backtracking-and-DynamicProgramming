// https://practice.geeksforgeeks.org/problems/minimum-sum-partition/0

import java.util.*;

class GFG
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt(),sum = 0;
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			int max = sum/2;
			boolean dp[][] = new boolean[n+1][max+1];
			for(int i=0;i<=n;i++)
			{
				dp[i][0] = true;
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=max;j++)
				{
					if(j<a[i-1])
						dp[i][j] = dp[i-1][j];
					else
						dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
			}
			int res=-1;
			for(int i=max;i>=0;i--)
			{
				if(dp[n][i])
				{
					res = i;
					break;
				}
			}
			System.out.println(sum-res-res);
		}
		sc.close();
	}
}
