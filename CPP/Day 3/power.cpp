#include<iostream>
using namespace std;
int main(){
    int base,exponent,power=1;
    cout<<"enter base"<<endl;
    cin>>base;
    cout<<"enter exponent"<<endl;
    cin>>exponent;
    for(int i=1;i<=exponent;i++)
    {
        power=power*base;

    }
    cout<<"power is   "<<power<<endl;

}