import java.util.*;
public static void  main(String args[])
{
class isomorphic
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
int len1,len2,count,count1,count3,count4;
int i,j;
len1=a.length();
len2=b.length();
a.toCharArrya();
b.toCharArray();
for(i=0;i<len1;i++)
{
for(j=i+1;j<len1;j++)
{
if(charAt(i)==charAt(j))
{
count=charAt[i];
count1=charAt[j];
}
}
}
for(i=0;i<len2;i++)
{
for(j=i+1;j<len2;j++)
{
if(charAt[i]==charAt[j])
{
count3=charAt[i];
count4=charAt[j];
}
}
if(count==count3&&count1==count4)
{
System.out.println("It is an isomorphic string");
}
}
}
