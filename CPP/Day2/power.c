#include<stdio.h>
int main()
{
    int base,exponent,i,power=1;
    printf("Enter base \n");
    scanf("%d" ,&base);
    printf("Enter exponent \n");
    scanf("%d" ,&exponent);

    for(i=1;i<=exponent;i++)
    {
        power=power*base;
    }
     printf("The power is %d",power);

}
