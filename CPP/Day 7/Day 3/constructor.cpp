#include<iostream>
using namespace std;
class Demo
{
    public:
    Demo() const
    {
        cout<<"No argument constructor \n";

    }
  
    
};
int main()
{
   const Demo d1();
   
}