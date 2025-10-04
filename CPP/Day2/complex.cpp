#include<iostream>
using namespace std;
class Complex
{
    int real , img;
    public :
    Complex();//No argument constructor
    Complex(int,int);//Parameterized Constructor
    void display() const;
    void setReal(int);
    int getReal() const;

};
void Complex :: setReal(int r)
{
    real=r;
}
int Complex :: getReal() const
{
    return real;
}
Complex :: Complex()
{
    cout << "in default constructor \n";
    real=1;
    img=2;

}
Complex :: Complex(int r, int i)
{
    cout << " \t in parameter constructor \n";
    real=r;
    img=i;
}
void Complex :: display() const
{
   cout<<"complex number is  "<<real<<"+"<<img<<"i"<<endl;
}
int main()
{
     Complex c1;
     c1.display();
    const Complex c2(5,6);
    cout<<"real part  "<<c2.getReal();
    Complex c3(1,2);
    c3.setReal(10);
    cout<<"\t real part "<<c3.getReal();

}

