#include<iostream>
using namespace std;
void show();
int main(){
    show();
    show();
    show();
}
void show(){
   static int x=0;
    cout<<x<<endl;
    x++;
}