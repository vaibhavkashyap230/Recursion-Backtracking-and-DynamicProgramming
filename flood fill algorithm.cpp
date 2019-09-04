#include<stdio.h>
#include<iostream>
#include<vector>
using namespace std;
void ffa(int x,int y,int m,int n,int t,int k,vector<vector<int>>&v)
{
    if(x<0 || x>=m || y<0 || y>=n)
    return;
    
    if(v[x][y]==t)
    {
    v[x][y]=k;
    ffa(x+1,y,m,n,t,k,v);
    ffa(x,y+1,m,n,t,k,v);
    ffa(x-1,y,m,n,t,k,v);
    ffa(x,y-1,m,n,t,k,v);
    }
    
}
int main()
 {
	int t;
	cin>>t;
	while(t--)
	{
	    int m,n;
	    cin>>m>>n;
	    vector<vector<int>>v(m,vector<int>(n));
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        cin>>v[i][j];
	    }
	}
	int x,y,k;
	cin>>x>>y>>k;
	int ta=v[x][y];
	ffa(x,y,m,n,ta,k,v);
	
	for(int i=0;i<m;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        cout<<v[i][j]<<" ";
	    }
	}
	cout<<endl;
	}
	return (0);
}
