import java.util.*;
class pattern9
{
public static void main(String args[])
{
int i,j,k,p,m,n;
for(i=1;i<=5;i++)
{
for(j=5;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println("");
}
for(p=1;p<=4;p++)
{
for(m=0;m<=p;m++)
{
System.out.print(" ");	
}	
for(n=4;n>=p;n--)
{
System.out.print("*");
}
System.out.println("");
}
}
}





