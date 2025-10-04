#include<cmath>
#include<iostream>
using namespace std;
int main(){
    cout<<"*********square root*************"<<endl;
    double answer;
    answer=sqrt(10);
    cout<<"square root is: "<<answer<<endl;
    cout<<"*********absolute*************"<<endl;
    int a =abs(1.9);
    int b=abs(-2.5);
     cout<<"absolute of a is: "<<a<<"\n"<<"absolute of b is: "<<b<<endl;
     cout<<"*********power*************"<<endl;
     int base=4,exponent=2,power;
     power=pow(base,exponent);
     cout<<"pow of power is: "<<power<<endl;
     cout<<"*********ceil*************"<<endl;
     float x=9.2;
     cout<<"ceil of x is: "<<ceil(x)<<endl;
     cout<<"*********floor*************"<<endl;
     float y = 7.8;
     cout<<"floor of y is: "<<floor(y)<<endl;
     cout<<"*********round*************"<<endl;
     float z=8.3;
     cout<<"round of z is: "<<round(z)<<endl;

}