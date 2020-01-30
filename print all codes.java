// https://classroom.codingninjas.com/app/classroom/me/1108/content/26996/offering/278179/problem/1389

import java.util.Scanner;

public class Try_2
{
	private static void ps(String s,String stn)
	{
		if(s.length()==0)
		{
			System.out.println(stn);
			return;
		}
		
		String c=s.substring(0,1);
		int d=Integer.parseInt(c);
		s=s.substring(1);
		stn+=(char)('a'+d-1);
		ps(s,stn);
		if(s.length()>1)
		{pd(s,stn);}
	}
	private static void pd(String s,String stn)
	{
		if(s.length()<2)
		{
			if(s.length()==0)
			{
				System.out.println(stn);
			}
			return;
		}
		
		String c=s.substring(0,2);
		int d=Integer.parseInt(c);
		if(d>26)
			return;
		s=s.substring(2);
		stn+=(char)('a'+d-1);
		ps(s,stn);
		if(s.length()>1)
		{pd(s,stn);}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		ps(s,"");
		pd(s,"");
	}
}
