#include<iostream>
using namespace std;
class temp
{
	 int a;
public:
	void get();
	temp add(temp & b1) //This function will take object as arguments and  return object
	{
		temp aobj3;
		aobj3.a= this->a +   b1.a;// aobj3.a=a+b1.a
		return aobj3;
	}
	void show()
	{
		cout<<"value is   "<<a;
	}
};
void temp:: get()
	{
		cin>>this->a;
	}
int main()
{
	temp aobj1,aobj2;
	aobj1.get();
	aobj2.get();
	temp aobj4=aobj1.add(aobj2);
	aobj4.show();
}