#include <iostream>
using namespace std;
class Student
{
     public:
    int rollno;
    char name[50];
    int marks[5];
    int dd,mm,yy;
    int total=0;
    
    void accept()
    {
        cout<<"Enter the rollno : "<<endl;
        cin>>rollno;
        cout<<"Enter the name : "<<endl;
        cin>>name;
        cout<<"Enter the date of birthday :"<<endl;
        cin>>dd>>mm>>yy;
        cout<<"Enter marks of 5 subjects :"<<endl;

        for(int i=0 ; i<=5;i++)
        {
            cin>>marks[i];
            total+=marks[i];
        }
       

    }

    void display()
    {
        cout<<"RollNo :"<<rollno<<endl;
        cout<<"Name :"<<name<<endl;
        cout<<"DOB :"<<dd<<"/"<<mm<<"/"<<yy;
        cout<<"Total : "<<total<<endl;
    }

};

int main()
{
    int n=10;
    Student s[n];
    cout<<"Enter data for 10 students : \n";
    for(int i=0;i<n;i++)
    {
        cout<<"\n Student  "<<i+1<<"\n ";
        s[i].accept();
    }
    for(int i=0;i<n-1;i++)
    { for(int j=i+1;j<n;i++)
        if(s[i].rollno >s[j].rollno)
        {
            Student temp =s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
      cout<<"\n Student sorted by Roll Number : \n";
     for(int i=0;i<n;i++)
     {
        s[i].display();
    
    }

}