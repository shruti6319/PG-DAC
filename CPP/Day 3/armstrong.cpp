#include<iostream>
using namespace std;
int main(){
    int num,sum=0;
    cout<<"enter number\n";
    cin>>num;
    int temp=num;
    while(temp!=0)
    {
        int rem=temp % 10;
        sum=sum+rem*rem*rem;
        temp=temp/10;
    }
    if(num==sum){
        cout<<"it is armstrong no"<<endl;
    }
    else{
        cout<<"it is not armstrong no"<<endl;
    }
}