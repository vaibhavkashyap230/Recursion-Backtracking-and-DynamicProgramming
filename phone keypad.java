package code;

import java.util.Scanner;

public class Phone_keys
{
	private static String[] list(int n)
    {
        if(n==2)
        {
        	String r[]={"a","b","c"};
        	return r;
        }
        else if(n==3)
        {
        	String r[]={"d","e","f"};
        	return r;
        }
        else if(n==4)
        {
        	String r[]={"g","h","i"};
        	return r;
        }
        else if(n==5)
        {
        	String r[]={"j","k","l"};
        	return r;
        }
        else if(n==6)
        {
        	String r[]={"m","n","o"};
        	return r;
        }
        else if(n==7)
        {
        	String r[]={"p","q","r","s"};
        	return r;
        }
        else if(n==8)
        {
        	String r[]={"t","u","v"};
        	return r;
        }
        else if(n==9)
        {
        	String r[]={"w","x","y","z"};
        	return r;
        }
        String r[]= {""};
        return r;
    }
    private static String[] kc(int n)
    {
        if(n<2)
        {
            String r[]={""};
            return r;
        }
        
        if(n<10)
        {
            return list(n);
        }
        
        String d[]=kc(n/10);
        String nc[]=list(n%10);
        String r[]=new String[d.length*nc.length];
        int c=0;
        for(int i=0;i<d.length;i++)
        {
        	for(int j=0;j<nc.length;j++)
        	{
        		r[c]=d[i]+nc[j];
        		c+=1;
        	}
        }
        return r;
    }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		String r[]=kc(n);
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
	}
}
