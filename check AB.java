public class Solution
{
    private static boolean check(String s,int i,int d)
    {
        if(i>=s.length())
        {
            return true;
        }
        
        if(d==1)
        {
            if(s.charAt(i)=='a')
            {
                return check(s,i+1,1);
            }
            else if(i<=s.length()-2 && s.substring(i,i+2).equals("bb"))
            {
                return check(s,i+2,2);
            }
            else
                return false;
        }
        else
        {
            if(s.charAt(i)=='a')
            {
                return check(s,i+1,1);
            }
            else
                return false;
        }
    }
	public static boolean checkAB(String s)
    {
        if(s.charAt(0)!='a')
            return false;
        return check(s,1,1);
	}
}
