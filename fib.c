#include <stdio.h>

int main()
{
int fab,f1=1,f2=1,result;
scanf("%d",&fab);
for(int i=1;i<=fab;i++)
{
    printf("%d ",f1);
    result=f1+f2;
    f1=f2;
    f2=result;
    
}
}
