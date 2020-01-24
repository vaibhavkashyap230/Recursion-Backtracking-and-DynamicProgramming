#include<stdio.h>
#include<iostream>
using namespace std;
void toh(int n,char s,char a,char d)
{
	if(n==0)
	{
		return;
	}
	
	if(n==1)
	{
		cout<<s<<"->"<<d<<endl;
		return;
	}
	
	toh(n-1,s,d,a);
	cout<<s<<"->"<<d<<endl;
	toh(n-1,a,s,d);
}
int main()
{
	cout<<"Enter the number of Disks : ";
	int n;
	cin>>n;
	cout<<endl<<"'S' for Source 'A' for Auxillary & 'D' for Destination"<<endl<<endl;
	toh(n,'S','A','D');
	return(0);
}
