#include<bits/stdc++.h>
using namespace std;
int mnj(int c,int a[],int n,int l)
{
	if(c>=n-1)
	return l;
	
	int mj[a[c]];
	for(int i=1;i<=a[c];i++)
	{
		mj[i-1]=mnj(c+i,a,n,l+1);
	}
	int mv=999;
	for(int i=0;i<a[c];i++)
	{
		if(mj[i]<mv)
		mv=mj[i];
	}
	return mv;
}
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
	cout<<mnj(0,a,n,0)<<endl;
	}
	return 0;
}
