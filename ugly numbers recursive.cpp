#include<bits/stdc++.h>
using namespace std;
int reduce(int n,int k)
{
	while(n%k==0)
	{
		n=n/k;
	}
	return n;
}
bool check(int n)
{
	n=reduce(n,2);
	n=reduce(n,3);
	n=reduce(n,5);
	if(n==1)
	return 1;
	return 0;
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
			int n;
	cin>>n;
	if(n==1)
	{
		cout<<1<<endl;
		continue;
	}
	int c=1,i=2;
	while(c<n)
	{
		if(check(i)==1)
		{
			c+=1;
		}
		i+=1;
	}
	cout<<i-1<<endl;
	}
	return(0);
}
