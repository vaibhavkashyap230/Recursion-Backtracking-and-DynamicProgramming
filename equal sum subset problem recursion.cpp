#include<stdio.h>
#include<iostream>
using namespace std;
bool check(int a[],int n,int c,int s1,int s2)
{
	if(c==n)
	{
		if(s1==s2)
		return 1;
		return 0;
	}
	
	bool f=check(a,n,c+1,s1+a[c],s2);
	bool s=check(a,n,c+1,s1,s2+a[c]);
	
	return (f|s);
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
	    int s1=0,s2=0;
	    bool r=check(a,n,0,s1,s2);
	if(r)
	cout<<"YES"<<endl;
	else
	cout<<"NO"<<endl;
	}
	return 0;
}
