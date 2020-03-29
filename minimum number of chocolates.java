// https://classroom.codingninjas.com/app/classroom/me/1108/content/30560/offering/323433/problem/1440

public class Solution
{
	public static int getMin(int a[], int n)
    {
        if(n==1)
            return 1;
        
        int l[] = new int[n];
        l[0]=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                l[i]=1+l[i-1];
            else
                l[i]=1;
        }
        int t=l[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
                l[i]=Math.max(l[i+1]+1,l[i]);
            
            t+=l[i];
        }
        return t;
    }
}