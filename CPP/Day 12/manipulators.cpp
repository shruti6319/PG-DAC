#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
        cout<<setfill('*');
        cout<<setw(5)<<1<<endl;
        cout<<setfill('*');
        cout<<setw(5)<<10<<endl;
        cout<<setfill('*');//when we dont want * symbol.setfill continue untill we write setfill(' ')
        cout<<setw(5)<<100<<endl;
        cout<<setiosflags(ios::showpos)<<100<<endl;//+100
        cout<<setiosflags(ios::showpos)<<-100<<endl;//-100
        /*when u want to display + sign before any positive number
        use showpos flag.work only for positive no*/
} 