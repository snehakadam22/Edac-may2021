import java.util.*;
class pattern7
{
public static void main(String args[])
{
int i,j,k,l,m,n,o,p;
for (i=1;i<=6;i++)
{
for(j=6;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print("*");
}
for(l=2;l<=i;l++)
{
System.out.print("*");
}
System.out.println();
}
for(m=1;m<=5;m++)
{
for(n=0;n<=m;n++)
{
System.out.print(" ");
}
for(o=5;o>=m;o--)
{
System.out.print("*");
}
for(p=4;p>=m;p--)
{
System.out.print("*");
}
System.out.println("");
}
}
}
