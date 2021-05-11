import java.util.*;
class pattern71
{
public static void main(String args[])
{
int i,j,l,m,n;
for (i=1;i<=5;i++)
{
	for(j=4;j>=i;j--)
	{
	System.out.print(" ");
	}
		for(int k=1;k<=i;k++)
		{
		System.out.print(" *");
		}
			System.out.println(" ");
	}

for(l=1;l<=5;l++)
{
for(m=1;m<=l;m++)
{
System.out.print(" ");
}
for(n=5;n>l;n--)
{
System.out.print(" *");
}
System.out.println(" ");
}
}
}
