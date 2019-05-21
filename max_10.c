#include <stdio.h>

int main()
{
int no=10,a[100],i,max=0;
for(i=0;i<no;i++)
{
    scanf("%d",&a[i]);
}
for(int j=0;j<no;j++)
{
    if(a[j]>max)
    {
        max=a[j];
    }
}
printf("%d",max);
}
