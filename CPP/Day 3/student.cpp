#include<iostream>
using namespace std;
#include<string.h>
class Student
{
    int rollno;
    char name[15];
    public:
    Student(){
        rollno=101;
        strcpy(name,"rahul");
        
    }
    Student(int i,char *ptr)
    {
        rollno=i;
        strcpy(name,ptr);
    }
    void display()
    {
        cout<<"rollno is"<<rollno<<endl;
        cout<<"name is"<<name<<endl;
    }
};

int main(){
    Student s1;
    s1.display();
    Student s2(102,"rohit");
    s2.display();
}

