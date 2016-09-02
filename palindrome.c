#include<stdio.h>
#include<conio.h>
void main()
{
int n,reversedInteger=0,remainder,originalInteger;
scanf("%d",&n);
originalInteger=n;
while(n!=0)
{
remainder=n%10;
reverseInteger=reverseInteger*10+remainder;
n=n/10;
}
if(originalInteger==reversedInteger)
printf("palindrome");
else
printf("not a palindrome");
getch();
}
