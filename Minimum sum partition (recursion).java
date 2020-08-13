// https://practice.geeksforgeeks.org/problems/minimum-sum-partition/0

import java.util.*;

class GFG
{
    
    private static void check(int a[],int i,int sum1,int sum2,int min[])
	{
		if(i==a.length)
		{
			if(Math.abs(sum1-sum2)<min[0])
				min[0] = Math.abs(sum1-sum2);
			return;
		}
		
		check(a,i+1,sum1+a[i],sum2,min);
		check(a,i+1,sum1,sum2+a[i],min);
	}
    
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
			int min[] = new int[1];
			min[0] = Integer.MAX_VALUE;
			check(a,0,0,0,min);
			System.out.println(min[0]);
		}
		sc.close();
	}
}
