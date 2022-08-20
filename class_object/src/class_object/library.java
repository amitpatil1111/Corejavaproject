package class_object;

import java.util.Scanner;

public class library
{ 
	private
	int bid,bprice;
	String bname;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter book id");
		bid=obj.nextInt();
		
		System.out.println("enter book price");
		bprice=obj.nextInt();
		
		System.out.println("enter book name");
		bname=obj.next();
	}
	
	void print()
	{
		System.out.println(" book id"+bid);
		System.out.println(" book price"+bprice);
		System.out.println(" book name"+bname);
	}
	
	public static void main(String[] args)
	{
		library l1=new library();
		l1.accept();
		l1.print();
	}
	

}
