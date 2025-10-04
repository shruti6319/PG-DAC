#include<iostream>
using namespace std;
int main(){
    int num,fact=1;
    cout<<"enter number"<<endl;
    cin>>num;
    
    for(int i=1;i<=num;i++)
    {
        fact=fact*i;

    }
    cout<<"factorial is   "<<fact<<endl;

}