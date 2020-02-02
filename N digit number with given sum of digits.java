// https://classroom.codingninjas.com/app/classroom/me/1108/content/27686/offering/286941/problem/5568

public class Solution
{

    private static void find(String output,int n,int sum) 
    {  
        if(n>0&&sum>=0){
            char I = '0';
            if(output == ""){
                I='1';
            }


            for(;I<='9';I++){
                find(output+I,n-1,sum-(I-'0'));
            }
        }
        else if(n==0&&sum==0){
            System.out.print(output+" ");
        }

    }
    public static void find(int n, int t)
    {
        find("",n,t);
    }
}
