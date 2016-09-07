import java.util.*;
public static void main(String args[])
{
class holiday
{
Scanner s=new Scanner(System.in);
String day=s.nextLine();
if(day.equalsIgnoreCase(Saturday)||day.equalsIgnoreCase(Sunday))
{
return true;
}
else
return false;
}
}
