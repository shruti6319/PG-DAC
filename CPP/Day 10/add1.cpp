#include<iostream>
using namespace std;
int main(){
    int num1,num2,sum;
    cout<<"enter numbers: "<<endl;
    cin>>num1>>num2;
    sum=num1+num1;
    cout<<"sum is: "<<sum<<endl;

    char str1,str2;
    int add;
    cout<<"enter character: "<<endl;
    cin>>str1>>str2;
    add = str1+str2;
    cout<<"addition of character is : "<<add<<endl;

    
    string str11,str22;
    string add1;
    cout<<"enter string: "<<endl;
    cin>>str11>>str22;
    add1 = str11 +"  "+ str22;
    cout<<"addition of string is : "<<add1<<endl;
}