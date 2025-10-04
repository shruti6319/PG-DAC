#include<iostream>
using namespace std;
int main(){
    int base,exponent,power=1;
    cout<<"enter base and exponent \n";
    cin>>base;
    cin>>exponent;
    for(int i=0;i<exponent;i++)
    {
        power=power*base;

    }
    cout<<"power is : "<<power<<endl;
}