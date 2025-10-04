#include <iostream> 
using namespace std; 
  
int main() 
{ 
    int a = 10; 
    int b = 20; 
    typedef int* iPtr; 
  
    iPtr pointer_to_a = &a; 
    iPtr pointer_to_b = &b; 
  
    cout << "a is: " << *pointer_to_a << "\n"; 
    cout << "b is: " << *pointer_to_b << "\n"; 
  
    return 0; 
}
