import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0)
	    {
	        int n = s.nextInt();
	        if(n==1)
	        {
	            System.out.println(1);
	            continue;
	        }
	        int a[] = new int[n+1];
	        a[0]=0;
	        a[1]=1;
	        for(int i=2;i<=n;i++)
	        {
	            int d=a[i/2]+1;
	            if(i%2==1)
	            {
	                d+=1;
	            }
	            a[i]=Math.min(a[i-1]+1,d);
	        }
	        System.out.println(a[n]);
	    }
	    s.close();
	}
}
