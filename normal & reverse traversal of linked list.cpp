#include<stdio.h>
#include<iostream>
using namespace std;
class node
{
	public:
		int data;
		node *next;
};
node *head;
void insert(int x)
{
	node *temp=new node();
	temp->data=x;
	temp->next=head;
	head=temp;
}
void print(node* head)
{
	if(head==NULL)
	return;
	cout<<head->data<<" ";
	print(head->next);
}
void rprint(node *head)
{
	if(head==NULL)
	return;
	rprint(head->next);
	cout<<head->data<<" ";
}
int main()
{
	head=NULL;
	cout<<"Enter the number of nodes : ";
	int n;
	cin >> n;
	cout << endl;
	for(int i=0;i<n;i++)
	{
		cout<<endl;
		cout<<"Enter the value at the "<<i+1<<"th node : ";
		int x;
		cin >> x;
		insert(x);
		cout<<"Linked list in normal order : ";
		print(head);
		cout<<endl;
		cout<<"Linked list in reverse order : ";
		rprint(head);
		cout<<endl;
	}
	return(0);
}
