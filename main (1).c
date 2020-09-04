/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int x=45;
    int y=98;
    int temp;
    x=x+y;
    y=x-y;
    x=x-y;
    printf("x=%d\ny=%d",x,y);
}
