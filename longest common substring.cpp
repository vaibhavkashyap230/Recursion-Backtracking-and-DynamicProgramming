#include<stdio.h>
#include<iostream>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	while(t--)
	{
	    int l1,l2;
	    cin>>l1>>l2;
	    string s1,s2;
	    cin>>s1>>s2;
	    
	    if(l1==0 || l2==0)
	    {
	        cout<<0<<endl;
	    }
	    int a[l1+1][l2+1];
	    for(int i=0;i<l1+1;i++)
	    {
	        a[i][0]=0;
	    }
	    for(int i=0;i<l2+1;i++)
	    {
	        a[0][i]=0;
	    }
	    int m=0;
	    for(int i=1;i<l1+1;i++)
	    {
	        for(int j=1;j<l2+1;j++)
	        {
	            if(s1[i-1]==s2[j-1])
	            a[i][j]=a[i-1][j-1]+1;
	            
	            else
	            a[i][j]=0;
	            
	            if(a[i][j]>m)
	            m=a[i][j];
	        }
	    }
	    cout<<m<<endl;
	}
	return 0;
}
