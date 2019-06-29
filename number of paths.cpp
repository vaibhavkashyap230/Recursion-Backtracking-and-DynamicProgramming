#include<iostream>
using namespace std;
int rfc(int i,int j,int r,int c,int t)
{
    if(i==r-1 & j==c-1)
    return t+1;
    
    if(i<r)
    {
        t=rfc(i+1,j,r,c,t);
    }
    if(j<c)
    {
        t=rfc(i,j+1,r,c,t);
    }
    return t;
}
int main()
 {
	int t;
	cin>>t;
	for(int x=0;x<t;x++)
	{
	    int r,c;
	    cin>>r>>c;
	    int t=rfc(0,0,r,c,0);
	    cout<<t<<endl;
	}
	return 0;
}
