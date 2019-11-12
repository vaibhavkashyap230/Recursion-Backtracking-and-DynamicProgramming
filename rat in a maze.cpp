#include<algorithm>
void count(int m[MAX][MAX],int i,int j,string s,vector<string> &r,int n,int c)
{
    if(i>=n || j>=n)
    return;
    
    if(i<0 || j<0)
    return;
    
    if(m[i][j]==0)
    return;
    
    if(i==n-1 && j==n-1)
    {
        r.push_back(s);
        return;
    }
    
    m[i][j]=0;
    if(c!=2)
    count(m,i-1,j,s+"U",r,n,1);
    if(c!=1)
    count(m,i+1,j,s+"D",r,n,2);
    if(c!=4)
    count(m,i,j-1,s+"L",r,n,3);
    if(c!=3)
    count(m,i,j+1,s+"R",r,n,4);
    m[i][j]=1;
    
}

vector<string> printPath(int m[MAX][MAX], int n)
{
    vector<string>r;
    string s="";
    count(m,0,0,s,r,n,-1);
    sort(r.begin(),r.end());
    return r;
}
