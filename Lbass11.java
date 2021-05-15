import java.util.*;
class Lbass11
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius");
double r = sc.nextDouble();
//float Area;
double Area, perimeter;
double PI = 3.141592653589793238;
Area = (PI*r*r);
perimeter = (2*PI*r);
System.out.println("Area : " +Area);
System.out.println("perimeter : " +perimeter);
}
}


