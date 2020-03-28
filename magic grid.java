// https://classroom.codingninjas.com/app/classroom/me/1108/content/30560/offering/323433/problem/1794

import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[][]=new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            
            int dp[][] = new int[m+1][n+1];
            for(int i=0;i<dp.length;i++)
            {
                dp[i][dp[i].length-1]=Integer.MAX_VALUE;
            }
            for(int i=0;i<dp[0].length;i++)
            {
                dp[dp.length-1][i]=Integer.MAX_VALUE;
            }
            for(int i=dp.length-2;i>=0;i--)
            {
                for(int j=dp[i].length-2;j>=0;j--)
                {
                    if(i==dp.length-2 && j==dp[i].length-2)
                        dp[i][j]=1;
                    else
                    {
                        int d = Math.min(dp[i][j+1],dp[i+1][j]);
                        if(a[i][j]<0)
                            dp[i][j] = d-a[i][j];
                        else
                            dp[i][j] = Math.max(1,d-a[i][j]);
                    }
                }
            }
            System.out.println(dp[0][0]);
        }
        sc.close();
	}
}