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
		sc.close();
		
		int r[][]=pas(a,n-1);
		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}
