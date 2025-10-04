#include<iostream>
using namespace std;
void display(char ='*',int=30);
int main(){
    int count=80;
    cout<<"no arguments passed"<<endl;
    display();

    cout<<"one argument is passed:"<<endl;
    display('#');

    cout<<"both arguments is passed:"<<endl;
    display('$',count);

    return 0;
}
void display(char c,int count)
{
    for(int i=1;i<=count;++i)

{
    cout<<c;
}
cout<<endl;
}