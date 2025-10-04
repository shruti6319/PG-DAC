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
for (int i = 1; i <= n; i++) 
    {
        for (int j = 1; j < n - i; j++)
        {
            cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            cout<<ch<< " ";
            ch++;
        }
             cout << endl;
    }
}