#include <iostream>
using namespace std;
int main()
{
    
    cout<<"const cast"<<endl;
    const int b=20;
 	 int* q;
 	 q = const_cast<int*>(&b);
 	 cout<<*q<<endl;
     getchar();
     return 0;
}