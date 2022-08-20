package array.java;

import java.util.Arrays;
import java.util.*;

public class sorting
{
 public static void main(String[] args)
 {
 int[] a=new int[6];
 int i;
 Scanner obj=new Scanner(System.in);
 System.out.println("enter array element=");
 for(i=0;i<=5;i++)
 {
	 a[i]=obj.nextInt();
 }
 Arrays.sort(a);
 System.out.println("sorting of element=");

 for(i=0;i<=5;i++)
 {
	System.out.println("\t"+a[i]); 
 }
		 
 }
}
