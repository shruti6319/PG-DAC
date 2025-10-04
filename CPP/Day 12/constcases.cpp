#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
    cout<<"case1 :non constant pointer pointing to const int"<<endl;
    int a=10;
    int x=20;
    const int *ptr=&a;
    cout<<*ptr<<endl;
    //*ptr=5;===>error
    //a=5;==>allowed
    ptr=&x;
    cout<<"case 2:const pointer pointing to non const integer"<<endl;
    int b=10;
    int y=20;
    int * const ptr1=&b;
    cout<<*ptr1<<endl;
    *ptr1=5;//allowed
    b=5;//allowed
    //ptr=&y;//error
    cout <<"case 3: const pointer pointing to const integer"<<endl;
    int c=10;
    int z=20;
    const int *const ptr2=&c;
    cout<<*ptr2<<endl;
    //*ptr=5;//not allowed
    c=5;//allowed
    //ptr=&z;//error
}
  

