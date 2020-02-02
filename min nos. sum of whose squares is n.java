// https://classroom.codingninjas.com/app/classroom/me/1108/content/27633/offering/285988/problem/915

import java.lang.Math;

public class Solution
{	
    private static int cal(int n,int c)
    {
        if(n==0)
            return c;
        
        int d=(int)(Math.sqrt(n));
        return cal(n-(d*d),c+1);
    }
	public static int minCount(int n)
    {
        return cal(n,0);
	}
}
