#include <iostream>  
using namespace std; 
class Complex
{

	int real,img;
	static int cnt;
	public:
		void show();
		Complex();
		Complex(int,int);
		static int getCnt();
		
};
int Complex::cnt; 
int Complex::getCnt()
{
	return cnt;
}
void Complex ::show()
{
	cout<<"complex no is "<<real<<"+"<<img<<"i"<<" "<<cnt<<endl;
}
Complex::Complex()
{
	cout<<"in default constructor\n";
	real=10;
	img=20;
	cnt++;
	
}
Complex::Complex(int r,int i)
{
	cout<<"in parametrized constructor\n";
	real=r;
	img=i;
	cnt++;
}
int main()
{
	Complex c1,c2;
	Complex c3(5,6);
	cout<<"no of obj created is "<<Complex::getCnt()<<endl;
	cout<<"sizeo of obj is  "<<sizeof(c1)<<endl;
	//cout<<Complex::cnt;//possible only if data member is public

}

