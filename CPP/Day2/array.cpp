#include<iostream>
using namespace std;
int main()
{
    int a[5],i;
    cout<<"1D Array \n";
    cout<<"accept array elements of 1d array\n";
    for(i=0;i<=4;i++)
    {
        //cin>>a[i];//subscript notation
        cin>>*(a+i);//pointer notation
    
    }
    cout<<"display array elements of 1d array\n";
    for(i=0;i<=4;i++)
    {
        //cout<<a[i]<<"\t";//subscript notation
        cout<<*(a+i)<<"\n";//pointer notation
    }
    cout<<"----------------------------------------------------------------";
    cout<<"2D Array \n";
    int b[3][3];int p,q;
    cout<<"accept elements of 2d array\n";
    for(p=0;p<=2;p++){
        for(q=0;q<=2;q++)
        {
            //cin>>a[i][j];//subscript notation
            cin>>*(*(b+p)+q);//pointer notation
        }
    }
    cout<<"display array elements of 2d array\n";
    for(p=0;p<=2;p++){
        for(q=0;q<=2;q++)
        {
            //cout>>a[i][j]<<"\t";//subscript notation
            cout<<*(*(b+p)+q)<<"\n";//pointer notation
        }
    }
    
}