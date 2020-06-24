// https://classroom.codingninjas.com/app/classroom/me/1108/content/39590/offering/441214/problem/6190

import java.util.*;

public class Solution
{
    public static int minGifts(int[] a)
    {
        int n = a.length;
        if(n==0)
            return 0;
        int l[] = new int[n];
        int r[] = new int[n];
        l[0]=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
                l[i] = l[i-1]+1;
            else
                l[i] = 1;
        }
        r[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
                r[i] = r[i+1]+1;
            else
                r[i] = 1;
        }
        int t=0;
        for(int i=0;i<n;i++)
        {
            t+=Math.max(l[i],r[i]);
        }
        return t;
    }    
}
