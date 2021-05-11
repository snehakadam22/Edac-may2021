import java.util.*;
class pattern10
{
public static void main(String args[])
{
int i,k,j;
for(i=1;i<=5;i++)
{
for(j=5;j>=i;j--)
{
System.out.print(" ");
}
for(k=5;k>=1;k--)
{
System.out.print("*");
}
System.out.println("");
}
}


}