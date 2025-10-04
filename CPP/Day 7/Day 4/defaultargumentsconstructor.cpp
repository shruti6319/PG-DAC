/*//Implementation of constructor within the class

#include <iostream>
using namespace std;
class A {
public:
    int sum ;
    
    A(int a, int x = 0) 
    {
        sum = a + x;
    }
    void print() { cout << "Sum =" << sum << endl; }
};
int main()
{
   
    A obj1(10, 20);
    A obj2(5);
    obj1.print();
    obj2.print();
    return 0;
}*/



//Implementation of constructor outside the class
#include <iostream>
using namespace std;
class A {
public:
    int sum;
    A(); 
    A(int , int  = 0); 
    
    void print() { cout << "Sum =" << sum << endl; }
};
A::A(int a, int x) 
    {
        sum = a + x;
    }
    
int main()
{
    
    A obj1(10, 20);
    A obj2(5);
    obj1.print();
    obj2.print();
    return 0;
}