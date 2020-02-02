// https://classroom.codingninjas.com/app/classroom/me/1108/content/27686/offering/286943/problem/5572

public class Solution
{
    private static int papc(int a[],int c,int t)
	{
        if(t==0)
            return 1;
        
		if(c<0)
			return 0;
		int r=0;
        
        r+=papc(a,c-1,t);
        r+=papc(a,c-1,t+a[c]);
        r+=papc(a,c-1,t-a[c]);
		
		return r;
	}
	public static int number(int[] a, int t)
    {
        return papc(a,a.length-1,t);
	}
}
