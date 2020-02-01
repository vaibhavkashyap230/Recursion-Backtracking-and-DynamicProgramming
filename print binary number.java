// https://classroom.codingninjas.com/app/classroom/me/1108/content/27686/offering/286940/problem/5567

private static void pabn(String stn,int n,int c1,int c0)
	{
		if(stn.length()==n)
		{
			System.out.println(stn);
			return;
		}
		
		pabn(stn+'1',n,c1+1,c0);
		if(c1-c0>0)
		{
			pabn(stn+'0',n,c1,c0+1);
		}
		return;
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		pabn("1",n,1,0);
	}
