#include<iostream>
using namespace std;
int main(){
    cout<<"enter the size of elements:"<<endl;
    int n;
    cin>>n;
    cout<<"enter the character from where the pattern will start:"<<endl;
    char ch;
    cin>>ch;
    cout<<"The pattern :"<<endl;
for(int row=0;row<=n;row++){
        for(int col=0;col<=row;col++)
        {
            cout<<ch<<"  ";
            ch++;

       }  
         cout<<endl;

    }
}