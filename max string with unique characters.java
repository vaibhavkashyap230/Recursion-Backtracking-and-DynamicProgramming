// https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/submissions/

package code;

public class Solution
{
	private static boolean check(String s)
    {
        int a[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[(int)(s.charAt(i)-'a')]+=1;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>1)
                return false;
        }
        return true;
    }
    private static void muc(String stn,List<String> a,int i,int c[])
    {
        if(i>=a.size())
            return;
        
        String s = stn+a.get(i);
        boolean r = check(s);
        if(r)
        {
            muc(s,a,i+1,c);
            if(s.length()>c[0])
                c[0]=s.length();
        }
        muc(stn,a,i+1,c);
    }
    public int maxLength(List<String> arr)
    {
        String s="";
        int a[] = new int[1];
        muc(s,arr,0,a);
        return a[0];
    }
}