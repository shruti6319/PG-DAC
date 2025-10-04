#include <iostream>
using namespace std;
 void demo()
{
    static int count = 0;
    cout << count << " ";
     count++;
}
 void demo1()
{
     static int count = 0,sum=0;
     sum=sum+count;
     cout<<sum<<"\n";
     count++;
}
 int main()
{
    for (int i = 0; i < 5; i++){
        demo();
    }
    cout<<"\n ---------------------------------------------------------------- \n";
    for (int i = 0; i < 5; i++){
        demo1();
    }
    return 0;
}