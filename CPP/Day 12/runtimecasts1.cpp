#include <iostream>
using namespace std;
int main()
{
   cout<<"static cast "<<endl;
   int i;
   float f=3.142f;
   i=static_cast<int>(f);
   cout<<i<<endl;
    getchar();
    return 0;
}