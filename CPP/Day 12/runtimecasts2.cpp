#include <iostream>
using namespace std;
int main()
{
   int i=100000;
   int* p;
  p=reinterpret_cast<int*>(i);
  cout<<p;
    getchar();
}