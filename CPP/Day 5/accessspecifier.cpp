/*#include<iostream>
using namespace std;
class Circle{
    private:
    double radius;

    public:
    double compute_area()
    return 3.14*radius*radius;
}
int main(){
    Circle object;
    object.radius=1.5;
    cout<<"area is"<<object.compute_area;
    return 0;

}*/

// C++ program to demonstrate protected access modifier
#include <iostream>
using namespace std;
 class Parent
{   
    protected:
    int id_protected;
  };
class Child : public Parent
{
    public:
    void setId(int id)
    { 
        // Child class is able to access the inherited protected data members of base class
             id_protected = id;
      }
       void displayId()
    {
        cout << "id_protected is: " << id_protected << endl;
    }
};
 int main() {
     
    Child obj1;
  // member function of the derived class can access the protected data members of the base class
  obj1.setId(81);
    obj1.displayId();

}

