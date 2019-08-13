#include<stdio.h>
#include<iostream>
#include<string>
using namespace std;
int lcs(string s1,string s2)
{
	int a[s1.length()+1][s2.length()+1];
	for(int i=0;i<s1.length()+1;i++)
	{
		a[i][0]=0;
	}
	for(int i=0;i<s2.length()+1;i++)
	{
		a[0][i]=0;
	}
	for(int i=1;i<s1.length()+1;i++)
	{
		for(int j=1;j<s2.length()+1;j++)
		{
			if(s1[i-1]==s2[j-1])
			a[i][j]=a[i-1][j-1]+1;
			else
			a[i][j]=max(a[i-1][j],a[i][j-1]);
		}
	}
	return a[s1.length()][s2.length()];
}
int main()
{
	string s1,s2;
	cout<<"Enter string 1 : ";
	cin>>s1;
	cout<<endl<<"Enter string 2 : ";
	cin>>s2;
	cout<<endl<<lcs(s1,s2);
	return(0);
}
