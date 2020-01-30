package code;

import java.util.Scanner;

public class Try 
{
	private static int[][] pas(int a[],int c)
	{
		if(c<0)
		{
			int r[][]=new int[1][0];
			return r;
		}
		
		int d[][]=pas(a,c-1);
		int r[][]=new int[d.length*2][];
		for(int i=0;i<d.length;i++)
		{
			r[i]=d[i];
		}
		for(int i=0;i<d.length;i++)
		{
			int nr[]=new int[d[i].length+1];
			for(int j=0;j<d[i].length;j++)
			{
				nr[j]=d[i][j];
			}
			nr[d[i].length]=a[c];
			r[i+d.length]=nr;
		}
		return r;
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		sc.close();
		
		int r[][]=pas(a,n-1);
		int c=0,s=0;
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				s+=r[i][j];
			}
			if(s==t)
				c+=1;
			s=0;
		}
		int ans[][]=new int[c][];
		s=0;c=0;
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				s+=r[i][j];
			}
			if(s==t)
			{
				ans[c]=r[i];
				c+=1;
			}
			s=0;
		}
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
