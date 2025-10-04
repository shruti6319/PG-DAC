#include<iostream>
using namespace std;

int main()
{
    int i,count=0;
    int n;
    cout<<"enter no:"<<endl;
    cin>>n;
    if(n<=1)
    {
        cout<<"number is not prime"<<endl;
    }
    for(int i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            count++;
        }
        break;
        return 0;
    }
    if(count==0)
    {
        cout<<"its prime no"<<endl;
    }
    else{
        cout<<"its not prime no"<<endl;
    }
    

}
