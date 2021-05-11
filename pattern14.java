import java.util.*;
class pattern14
{
public static void main(String args[])
{
int i,j,k,l,m,n;
for(i=1;i<=4;i++)
{
for(j=2;j<=i;j++)
{
System.out.print(" ");
}
for(k=5;k>=i;k--)
{
System.out.print(" *");
}
System.out.println(" ");
}
for(l=1;l<=5;l++)
{
for(m=5;m>=l;m--)
{
System.out.print(" ");
}
for(n=1;n<=l;n++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}

}