#include<stdio.h>
#include<iostream>
#include<string>
using namespace std;
int lcs(int i,int j,string s1,string s2,int l)
{
	if(i<0 || j<0)
	return l;
	
	else if(s1[i]==s2[j])
	return lcs(i-1,j-1,s1,s2,l+1);
	
	return max(lcs(i-1,j,s1,s2,l),lcs(i,j-1,s1,s2,l));
}
int main()
{
	string s1,s2;
	cout<<"Enter 1st string : ";
	cin>>s1;
	cout<<endl<<"Enter the 2nd string : ";
	cin>>s2;
	cout<<endl<<"The longest common subsequence is : "<<lcs(s1.length()-1,s2.length()-1 ,s1,s2,0);
	return 0;
}
