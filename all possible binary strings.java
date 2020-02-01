// https://classroom.codingninjas.com/app/classroom/me/1108/content/27686/offering/286939/problem/5563

private static void alls(String s,int c)
	{
		if(c>=s.length())
		{
			System.out.println(s);
			return;
		}
		
		if(s.charAt(c)=='?')
		{
			alls(s.substring(0,c)+'0'+s.substring(c+1),c+1);
			alls(s.substring(0,c)+'1'+s.substring(c+1),c+1);
		}
		else
		{
			alls(s,c+1);
		}
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		alls(s,0);
	}
