// https://practice.geeksforgeeks.org/problems/form-a-palindrome/0

import java.util.*;

class GFG
 {
	public static void main (String[] args)
	 {
     	Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            String s1 = sc.next(),s2="";
            int n = s1.length();
            for(int i=n-1;i>=0;i--)
            {
                s2+=s1.charAt(i);
            }
            int dp[][] = new int[n+1][n+1];
            for(int i=1;i<=n;i++)
            {
                dp[i][0]=i;
                dp[0][i]=i;
            }
            dp[0][0]=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        dp[i][j] = 1 + dp[i-1][j-1];
                    else
                        dp[i][j] = 1 + Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
            System.out.println(dp[n][n]-n);
        }
        sc.close();
	 }
}
