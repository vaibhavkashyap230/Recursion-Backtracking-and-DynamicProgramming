// https://practice.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string/0/

// application of Kadane's Algorithm

import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
		Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0)
        {
        	String s = sc.next();
            int prev, max = -1;
            if(s.charAt(0)=='0')
                prev = 1;
            else
                prev = -1;
            for(int i=1;i<s.length();i++)
            {
                int cur;
                if(s.charAt(i)=='0')
                    cur = 1;
                else
                    cur = -1;
                prev = Math.max(cur,prev+cur);
                if(prev>max)
                	max = prev;
            }
            System.out.println(max);
        }
        sc.close();
	 }
}
