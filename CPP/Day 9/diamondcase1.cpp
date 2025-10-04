#include <iostream>
using namespace std;

class Base {
public:
    void fun() { 
        cout << "Base" << endl; 
    }

};
class Parent1 : public Base {
public:
};

class Parent2 : public Base {
public:
};
class Child : public Parent1, public Parent2 {    
   
};

int main()
{
    Child* obj = new Child();
    obj->fun(); 
    return 0;
}