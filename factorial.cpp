#include<stdio.h>
#include<iostream>
using namespace std;
int factorial(int n)
{
	if(n<2)
	{
		return(1);
	}
	else
	{
		return(n*factorial(n-1));
	}
}
int main()
{
	cout<<"Enter the number whose factorial is to be formed : ";
	int n;
	cin >>n;
	cout<<endl;
	cout<<"The factorial of "<<n<<" is = "<<factorial(n);
	return(0);
}
