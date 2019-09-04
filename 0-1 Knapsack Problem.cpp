#include<stdio.h>
#include<iostream>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	while(t--)
	{
	    int n,c;
	    cin>>n>>c;
	    int w[n];
	    int co[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>co[i];
	    }
	    for(int i=0;i<n;i++)
	    {
	        cin>>w[i];
	    }
	    int a[n][c+1];
	    for(int i=0;i<c+1;i++)
	    {
	        if(i<w[0])
	        a[0][i]=0;
	        
	        else
	        a[0][i]=co[0];
	    }
	    for(int i=1;i<n;i++)
	    {
	        for(int j=0;j<c+1;j++)
	        {
	            if(j<w[i])
	            a[i][j]=a[i-1][j];
	            
	            else if(j==w[i])
	            a[i][j]=max(co[i],a[i-1][j]);
	            
	            else
	            a[i][j]=max(a[i-1][j],co[i]+a[i-1][j-w[i]]);
	        }
	    }
	    cout<<a[n-1][c]<<endl;
	}
	return 0;
}
