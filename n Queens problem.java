// https://classroom.codingninjas.com/app/classroom/me/1108/content/27805/offering/288434/problem/868

public class Solution
{	
    private static boolean check(int r,int c,int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i][c]==1)
				return false;
		}
		int rc=r,cc=c;
		while(rc>=0 && cc>=0)
		{
			if(a[rc][cc]==1)
				return false;
			rc-=1;
			cc-=1;
		}
		rc=r;
		cc=c;
		while(rc<a.length && cc<a.length)
		{
			if(a[rc][cc]==1)
				return false;
			rc+=1;
			cc+=1;
		}
		rc=r;
		cc=c;
		while(rc<a.length && cc>=0)
		{
			if(a[rc][cc]==1)
				return false;
			rc+=1;
			cc-=1;
		}
		rc=r;
		cc=c;
		while(rc>=0 && cc<a.length)
		{
			if(a[rc][cc]==1)
				return false;
			rc-=1;
			cc+=1;
		}
		return true;
	}
	private static void nqueens(int r,int c,int a[][])
	{
		if(c>=a.length)
			return;
		if(r==a.length && c==0)
		{
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
			return;
		}
		
		if(check(r,c,a)==false)
			return;
		
		a[r][c]=1;
		for(int i=0;i<a.length;i++)
		{
			nqueens(r+1,i,a);
		}
		a[r][c]=0;
	}
public static void placeNQueens(int n)
{
		int a[][]=new int[n][n];
		for(int i=0;i<a.length;i++)
		{
			nqueens(0,i,a);
		}
}
	
}
