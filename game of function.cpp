#include<stdio.h>
#include<iostream>
using namespace std;
int rf(int n)
{
    if(n==0)
    return 1;
    int r=rf(n-1)-n+1;
    return r;
}
int main()
 {
	int t;
	cin>>t;
	for(int x=0;x<t;x++)
	{
	    int n;
	    cin>>n;
	    int r=rf(n);
	    cout<<r<<endl;
	}
	return 0;
}
