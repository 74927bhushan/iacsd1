#include<iostream>
using namespace std;
int main12()
{
	int num;
		bool flag=true;
	cout<<"enter any number::";
	cin>>num;

	for (int i=2;i*i<=num;i++)
	{
	    if	(num%i==0)
	{
			
		 flag =false;
		break;
	}
	}
	if( flag && num>1)
	{
		cout<<"number is prime";
	}
	else{
		cout<<"no is not prime";
	}
	return 0;
}
