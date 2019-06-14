#include<stdio.h>
#include<iostream>
using namespace std;
void pr(int o,int n)
{
    if(n<=o)
    {
        cout<<n<<" ";
        pr(o,n+5);
    }
}
void print(int o,int n)
{
    if(n<=0)
    {
        pr(o,n);
        return;
    }
    cout<<n<<" ";
    print(o,n-5);
}
int main()
 {
	int t;
	cin>>t;
	for(int x=0;x<t;x++)
	{
	    int n;
	    cin>>n;
	    cout<<n<<" ";
	    print(n,n-5);
	    cout<<endl;
	}
	return 0;
}
