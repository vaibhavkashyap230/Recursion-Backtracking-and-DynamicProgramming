#include<stdio.h>
#include<iostream>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }
	    int dp[n];
	    dp[0]=0;
	    for(int i=1;i<n;i++)
	    {
	        dp[i]=INT_MAX;
	    }
	    for(int i=0;i<n;i++)
	    {
	         for(int j=0;j<=a[i];j++)
	         {
	             if(i+j<n)
	             dp[i+j]=min(dp[i+j],dp[i]+1);
	         }
	    }
	    if(dp[n-1]<INT_MAX)
	    cout<<dp[n-1]<<endl;
	    else
	    cout<<-1<<endl;
	}
	return 0;
}
