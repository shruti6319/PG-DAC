#include<iostream>
using namespace std;
int main(){
    int a[3][3]={1,2,3,4,5,6,7,8,9};
    int b[3][3];
    int i,j;

    for(j=0;j<=2;++j)
    {
        for(i=0;i<=2;++i)
        {
            *(*(b+i)+j)=*(*(a+i)+j);
             cout<<*(*(b+i)+j);
        }
        
        cout<<endl;
        

    }
    


   
}