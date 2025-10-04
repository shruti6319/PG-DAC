#include<iostream>
using namespace std;
int main(){
    cout<<"enter first number"<<endl;
    int num1;
    cin>>num1;
    cout<<"enter second number"<<endl;
    int num2;
    cin>>num2;
    cout<<"before swapping :"<<endl;
    cout<<"Num1 : "<<num1<<endl;
    cout<<"Num2 : " <<num2<<endl;
    
    int temp;
    temp=num1;
    num1=num2;
    num2=temp;

    cout<<"after swapping :"<<endl;
    cout<<"Num1 : "<<num1<<endl;
    cout<<"Num2 : " <<num2<<endl;
}