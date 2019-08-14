#include<stdio.h>
#include<iostream>
using namespace std;
int mnj(int c,int a[],int n,int l)
{
if(c>=n-1)
return l;

int temp;
int min_value=999;
for(int i=1;i<=a[c];i++)
{
temp=mnj(c+i,a,n,l+1);
if(temp<min_value)
min_value=temp;
}
return min_value;
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
