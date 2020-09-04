/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    int arr[]={1,2,4,6,3,7,8};
    int len=7;
    int sum=(len+1)*(len+2)/2;
    for(int index=0;index<len;index++)
    {
        sum-=arr[index];
    }
    printf("%d",sum);
    
}
