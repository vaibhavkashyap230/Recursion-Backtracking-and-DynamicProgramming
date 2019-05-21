#include<stdio.h>
#include<iostream>
using namespace std;
class node
{
	public:
		int data;
		node *link;
};
node *head;
void insert(int x)
{
	node *temp=new node;
	temp->data=x;
	temp->link=NULL;
	if(head==NULL)
	head=temp;
	else
	{
		node *temp1=head;
		while(temp1->link!=NULL )
		{
			temp1=temp1->link;
		}
		temp1->link=temp;
	}
}
void print(node *temp)
{
	if(temp==NULL)
	return;
	cout<<temp->data<<" ";
	print(temp->link);
}
void reverse(node *temp)
{
	if(temp->link==NULL)
	{
		head=temp;
		return;
    }
		reverse(temp->link);
		node *next=temp->link;
		next->link=temp;
		temp->link=NULL;
}
int main()
{
	insert(10);
	insert(20);
	insert(30);
	insert(40);
	insert(50);
	cout<<"The linked list is : "<<endl;
	print(head);
	cout<<endl;
	cout<<"The reversed linked list is : "<<endl;
	reverse(head);
	print(head);
	return(0);
}
