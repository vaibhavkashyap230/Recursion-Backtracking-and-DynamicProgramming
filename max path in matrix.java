// https://practice.geeksforgeeks.org/problems/path-in-matrix/0

class GFG {
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int m[][] = new int[n][n];
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                m[i][j]=sc.nextInt();
	            }
	        }
	        int dp[][] = new int[n][n+2];
	        for(int i=0;i<dp.length;i++)
	        {
	            dp[i][0]=Integer.MIN_VALUE;
	            dp[i][dp[i].length-1]=Integer.MIN_VALUE;
	        }
	        for(int i=1;i<dp[0].length-1;i++)
	        {
	            dp[dp.length-1][i]=m[m.length-1][i-1];
	        }
	        for(int i=dp.length-2;i>=0;i--)
	        {
	            for(int j=1;j<dp[i].length-1;j++)
	            {
	            	int x = Math.max(dp[i+1][j],Math.max(dp[i+1][j+1],dp[i+1][j-1]));
	                dp[i][j] = x + m[i][j-1];
	            }
	        }
	        int r = Integer.MIN_VALUE;
	        for(int i=0;i<dp[0].length-1;i++)
	        {
	            if(dp[0][i]>r)
	                r = dp[0][i];
	        }
	        System.out.println(r);
	    }
	    sc.close();
	}
}
