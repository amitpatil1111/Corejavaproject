package array.java;

import java.util.Scanner;

public class array2dmultiplication
{ 
	public static void main(String[] args)
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int [3][3];
		int i,j,k;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter A array element");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
			a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter B array element");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
			b[i][j]=obj.nextInt();
			}
		}
		System.out.println("multiplication of  array element");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
			c[i][j]=0;
			for(k=0;k<=2;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				System.out.println("\t"+c[i][j]);
			}
			}
		}
	}

}
