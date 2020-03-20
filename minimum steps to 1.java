// https://classroom.codingninjas.com/app/classroom/me/1108/content/30559/offering/323403/problem/111

public class Solution
{	
    private static int minj(int n,int c)
    {
        if(n==1)
            return c;
        
        int m1 = minj(n-1,c+1);
        int m2 = Integer.MAX_VALUE;
        if(n%2==0)
        {
            m2 = minj(n/2,c+1);
        }
        int m3 = Integer.MAX_VALUE;
        if(n%3==0)
        {
            m3 = minj(n/3,c+1);
        }
        
        return Math.min(m1,Math.min(m2,m3));
    }
	public static int countStepsTo1(int n)
    {
        return minj(n,0);
	}
}