
#include <iostream>
using namespace std;

int main()
{
    int num ;
    cout<<"Enter a number \n";
    cin>>num;
    int a = 0, b = 1;
    cout << a << "\n " << b << "\n ";
    
    int nextTerm;
    for(int i = 2; i < num; i++){
        nextTerm = a + b;
        a = b;
        b = nextTerm;
        
        cout << nextTerm << "\n ";
    }

   
}