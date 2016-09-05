#include<stdio.h>
#include<conio.h>
void main()
{
int a,n,m=0;
scanf("%d",&n);
while(n!=0)
{
a=n%10;
m=m+a*10;
n=n/10;
}
m=m/10;
printf("%d",m);
getch();
}
