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
	    if(n==1)
	    {
	        cout<<1<<endl;
	        continue;
	    }
	    if(n==2)
	    {
	        cout<<2<<endl;
	        continue;
	    }
	    if(n==3)
	    {
	        cout<<4<<endl;
	        continue;
	    }
	    int t1=1,t2=2,t3=4;
	    int t=0;
	    for(int i=3;i<n;i++)
	    {
	        t=t1+t2+t3;
	        t1=t2;
	        t2=t3;
	        t3=t;
	    }
	    cout<<t<<endl;
	}
	return 0;
}
