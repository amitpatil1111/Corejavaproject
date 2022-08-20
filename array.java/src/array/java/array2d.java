package array.java;

import java.util.Scanner;

public class array2d 
{
	public static void main(String[]args)
	{	
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		int i,j;
		
		
	Scanner obj=new Scanner(System.in);	
	
	System.out.println("enter a Array element");
	for(i=0;i<=2;i++)
	{
	 for(j=0;j<=2;j++)
		{	
		a[i][j]= obj.nextInt();
		
	    }
	}
	System.out.println("enter b Array element");
	for(i=0;i<=2;i++)
	{
	 for(j=0;j<=2;j++)
		{	
		b[i][j]=obj.nextInt();
		}
	}
	System.out.println("addition");
	for(i=0;i<=2;i++)
	{
	 for(j=0;j<=2;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		System.out.println("\t"+c[i][j]);
		}
	}
	
	}

}
