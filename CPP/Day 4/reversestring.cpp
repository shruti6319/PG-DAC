/*#include<iostream>
using namespace std;
#include<cstring>
#include<string.h>
int main()
{
    char str[]="hello world";
    cout<<strrev(str)<<endl;
}*/

#include<iostream>
using namespace std;
#include <string.h> 
int main () {
    char s[20]="hello world";
    int length = strlen(s);
    int i, j;
    char temp;

    for (i = 0, j = length - 1; i < j; i++, j--) {
        temp = *(s+i);
        *(s+i) = *(s+j);
        *(s+j) = temp;
    }
    cout<<s;
}