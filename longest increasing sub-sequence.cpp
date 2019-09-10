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
	    int dp[n];
	    for(int i=0;i<n;i++)
	    {
	        dp[i]=1;
	    }
	    int s=0;
	    for(int e=1;e<n;e++)
	    {
	        while(s<e)
	        {
	            if(a[e]>a[s])
	            dp[e]=max(dp[e],dp[s]+1);
	            s+=1;
	        }
	        s=0;
	    }
	    int m=dp[0];
	    for(int i=1;i<n;i++)
	    {
	        if(dp[i]>m)
	        m=dp[i];
	    }
	    cout<<m<<endl;
	}
	return 0;
}
