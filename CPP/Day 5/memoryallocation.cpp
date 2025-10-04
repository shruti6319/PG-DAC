/*//allocate memory dynamically for 1 integer,1character
#include<iostream>
using namespace std;
int main(){
    int* ptr=new int;
    *ptr=10;
    cout<<*ptr;
delete[]ptr;}*/
//allocate memory dynamically for n integer,n 
#include<iostream>
using namespace std;
int main(){
int n,i;
cout<<"enter no of elements\n";
cin>>n;
int* ptr=new int[n];
cout<<"accept elements\n";
for(i=0;i<n;i++)
{
    cin>>ptr[i];
}
cout<<"display elements\n";
for(i=0;i<n;i++)
{
    cout<<ptr[i]<<"\t";
}
delete[]ptr;
}