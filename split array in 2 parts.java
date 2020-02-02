// https://classroom.codingninjas.com/app/classroom/me/1108/content/27633/offering/285988/problem/923

public class solution
{
    private static boolean check(int a[],int c,int fa,int ta)
    {
        if(c==a.length)
        {
            if(fa==ta)
                return true;
            return false;
        }
        
        boolean c5=false,c3=false,o=false;
        if(a[c]%5==0)
        {
            c5=check(a,c+1,fa+a[c],ta);
        }
        else if(a[c]%3==0)
        {
            c3=check(a,c+1,fa,ta+a[c]);
        }
        else
        {
            o=check(a,c+1,fa,ta+a[c]) || check(a,c+1,fa+a[c],ta);
        }
        
        return (o || (c5 || c3));
    }
	public static boolean splitArray(int a[])
    {
        return check(a,0,0,0);
	}
}
