#include<stdio.h>
#include<iostream>
using namespace std;
int main()
 {
    int test;
    cin>>test;
	while(test--)
	{
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }
	    int dp[n];
	    dp[0] = 0;
	    for(int i=1;i<n;i++)
	    {
	        dp[i] = -1;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(dp[i]==-1)
	            break;
	        for(int j=1;j<=a[i];j++)
	        {
	            if(i+j>=n)
	                break;
	           
	           if(dp[i+j]==-1)
	                dp[i+j] = dp[i]+1;
	           else
	                dp[i+j] = min(dp[i]+1,dp[i+j]);
	        }
	    }
	    cout<<dp[n-1]<<endl;
	}
	return 0;
}
