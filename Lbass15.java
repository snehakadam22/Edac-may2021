import java.util.*;
class Lbass10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
int temp;
System.out.println(a+"  "+b);
temp=a;
a=b;
b=temp;
System.out.println(a+"  "+b);
}
}
