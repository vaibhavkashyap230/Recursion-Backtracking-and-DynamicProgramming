import java.util.Scanner;

public class Try 
{
	private static String[] pp(String s,int c)
	{
		if(c==s.length()-1)
		{
			String r[]=new String[1];
			r[0]=s.substring(c);
			return r;
		}
		
		String d[]=pp(s,c+1);
		String r[]=new String[(d.length)*(d[0].length()+1)];
		int in=0;
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<=d[i].length();j++,in++)
			{
				if(j==0)
				{
					r[in]=s.charAt(c)+d[i];
				}
				else if(j==d[i].length())
				{
					r[in]=d[i]+s.charAt(c);
				}
				else
				{
					r[in]=d[i].substring(0,j)+s.charAt(c)+d[i].substring(j);
				}
			}
		}
		return r;
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		 String r[]=pp(s,0);
		 for(int i=0;i<r.length;i++)
		 {
			 System.out.print(r[i]+" ");
		 }
		 System.out.println();
	}
}
