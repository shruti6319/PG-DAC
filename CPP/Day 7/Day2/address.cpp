#include<iostream>
using namespace std;
int main()
{
    int a=10,b=20;
    cout<<"before swapping \n";
    cout<<"a = "<<a<<"\n"<<"b ="<<b;
    swap(a,b);
    cout<<"\n after swapping in main() \n";
     cout<<"a = "<<a<< "\n"<<"b ="<<b;

}
void swap(int *p,int *q)
{
    int temp;
    temp=*p;
    *p=*q;
    *q=temp;
   cout<<"\n after swapping in swap() \n";
   cout<<" *p = "<< *p <<"\n"<<"*q ="<<*q;

}