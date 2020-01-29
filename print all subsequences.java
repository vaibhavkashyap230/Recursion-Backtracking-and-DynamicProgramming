package code;

import java.util.Scanner;

public class Try 
{
	private static String[] subseq(String s)
	{
		if(s.length()==0)
		{
			String r[]= {""};
			return r;
		}
		
		String d[]=subseq(s.substring(1));
		String r[]=new String[d.length*2];
		for(int i=0;i<d.length;i++)
		{
			r[i]=d[i];
		}
		for(int i=0;i<d.length;i++)
		{
			r[i+d.length]=s.charAt(0)+d[i];
		}
		return r;	
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		String r[]=subseq(s);
		for(int i=0;i<r.length;i++)
		{
			System.out.println(r[i]);
		}
	}
}
