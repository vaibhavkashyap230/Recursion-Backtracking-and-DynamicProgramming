// https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence/0

class GFG
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			int dp[] = new int[n];
			for(int i=0;i<n;i++)
			{
				dp[i] = a[i];
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[j]>a[i])
						dp[j] = Math.max(dp[j],dp[i]+a[j]);
				}
			}
			int res = 0;
			for(int i : dp)
			{
				if(i>res)
					res=i;
			}
			System.out.println(res);
		}
		sc.close();
	}
}
