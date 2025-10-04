#include<iostream>
using namespace std;
int main()
{
    //pass by value
    int a=10;
    int &a_new=a;
    cout<<a_new<<"\t"<<a<<"\n";//same value
    cout<<&a_new<<"\t"<<&a<<"\n";//same address

}