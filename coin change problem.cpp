#include<bits/stdc++.h>
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
	    int k;
	    cin>>k;
	    sort(a,a+n);
	    
	    int dp[n+1][k+1];
	    for(int i=0;i<k+1;i++)
	    {
	        dp[0][i]=0;
	    }
	    for(int i=0;i<n+1;i++)
	    {
	        dp[i][0]=1;
	    }
	    
	    for(int i=1;i<n+1;i++)
	    {
	        for(int j=1;j<k+1;j++)
	        {
	            if(j<a[i-1])
	            dp[i][j]=dp[i-1][j];
	            
	            else
	            {
	                dp[i][j]=dp[i-1][j]+dp[i][j-a[i-1]];
	            }
	        }
	    }
	    cout<<dp[n][k]<<endl;
	}
	return 0;
}
