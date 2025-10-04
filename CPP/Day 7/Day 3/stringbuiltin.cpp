#include<iostream>
using namespace std;
#include<string.h>
int main(){
   char str[50]="hello world";
   char str1[]="hello\0 world";
   int len=strlen(str);
   cout<<"length of string is "<<len<<endl;
   cout<<"size of string is "<<sizeof(str)<<endl;
   cout<<str<<endl;
   cout<<str1<<endl;
   cout<<strlen(str1)<<endl;
   cout<<sizeof(str1)<<endl;
   strcat(str,str1);
   cout<<str<<endl;
    
   char str2[50];
   strcpy(str2,str1);
   cout<<str2;
}
