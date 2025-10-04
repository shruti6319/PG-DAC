#include<iostream>
using namespace std;
class Base{
    private:
    int pvt=1;

    public:
    int pub=2;

    int getPvt() {return pvt;}

    protected:
    int prot=3;
};

class ProtectedDerieved : protected Base {
    public:
    int getPub(){return pub;}

    int getProt(){return prot;}
};

int main(){
    ProtectedDerieved obj1;
    cout<<"private is not accessed"<<endl;
    cout<<"public is "<<obj1.getPub()<<endl;
    cout<<"protected is"<<obj1.getProt()<<endl;
   // cout<<obj1.pub; //error
    //cout<<obj1.prot; //error
    //cout<<obj1.getPvt; //error
}