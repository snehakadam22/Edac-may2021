import java.util.*;
class pattern4
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=2;j<=i;j++)
			{
			System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
			System.out.print("*");	
			}
		System.out.println();
		}
	}
}