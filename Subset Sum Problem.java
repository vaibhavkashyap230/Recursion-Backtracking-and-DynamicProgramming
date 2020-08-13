// https://practice.geeksforgeeks.org/problems/subset-sum-problem/0

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
			if(sum%2==1)
			{
				System.out.println("NO");
				continue;
			}
			int target = sum/2;
			boolean dp[][] = new boolean[n+1][target+1];
			for(int i=0;i<=n;i++)
			{
				dp[i][0] = true;
			}
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=target;j++)
				{
					if(j<a[i-1])
						dp[i][j] = dp[i-1][j];
					else
						dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i-1]];
				}
			}
			if(dp[n][target])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}
}
