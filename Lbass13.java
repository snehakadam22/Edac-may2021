import java.util.*;
class Lbass13
{
public static void main(String args[])
{
float Area,perimeter;
Scanner sc = new Scanner(System.in);
float length1=sc.nextFloat();
float breadth1=sc.nextFloat();
Area= (length1*breadth1);
perimeter = 2*(length1+breadth1);
System.out.println("Area : " +Area);
System.out.println("perimeter :" +perimeter);
}
}