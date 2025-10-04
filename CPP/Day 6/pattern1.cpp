#include<iostream>
using namespace std;
int main(){
    cout<<"enter the size of elements:"<<endl;
    int n;
    cin>>n;
    cout<<"enter the number from where the pattern will start:"<<endl;
    int num;
    cin>>num;
    cout<<"The pattern :"<<endl;
for(int row=0;row<=n;row++){
        for(int col=0;col<=row;col++)
        {
            cout<<num<<"  ";
            num++;
       }
         cout<<endl;

    }
}