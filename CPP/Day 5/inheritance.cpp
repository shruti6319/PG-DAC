
// C++ program to demonstrate implementation of Inheritance
/*/ #include <bits/stdc++.h>
using namespace std;
class Parent {
public:
    int id_p;
};
class Child : public Parent {
public:
    int id_c;
};
 int main()
{
    Child obj1;
 
    // An object of class child has all data members and member functions of class parent
    obj1.id_c = 7;
    obj1.id_p = 91;
    cout << "Child id is: " << obj1.id_c << '\n';
    cout << "Parent id is: " << obj1.id_p << '\n';
    cout<<sizeof(obj1);
}
*/

//When base class obj is created memory is allocated for base class datamembers only. Through base class obj, we can access base class members only ,we cannot access derived class members.

#include <bits/stdc++.h>
using namespace std;
class Parent {
public:
    int id_p;
};
class Child : public Parent {
public:
    int id_c;
};
 int main()
{
    Parent obj1;
 
    // An object of class child has all data members and member functions of class parent
   // obj1.id_c = 7;//error
    obj1.id_p = 91;
   // cout << "Child id is: " << obj1.id_c << '\n';//error
    cout << "Parent id is: " << obj1.id_p << '\n';
    cout<<sizeof(obj1);
}