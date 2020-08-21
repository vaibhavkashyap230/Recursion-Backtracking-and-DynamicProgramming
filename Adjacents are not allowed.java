// https://practice.geeksforgeeks.org/problems/adjacents-are-not-allowed/0/

import java.util.*;

class GFG
 {
	public static void main (String[] args)
	 {
     	Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int temp = sc.nextInt();
                a[i] = Math.max(a[i],temp);
            }
            int dp[] = new int[n+1];
            dp[0] = 0;
            dp[1] = a[0];
            for(int i=2;i<=n;i++)
            {
                dp[i] = Math.max(a[i-1]+dp[i-2],dp[i-1]);
            }
            System.out.println(dp[n]);
        }
        sc.close();
	 }
}
