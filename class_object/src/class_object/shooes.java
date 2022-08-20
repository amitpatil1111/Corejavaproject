package class_object;
import java.util.*;
public class shooes
{
	private
	 int size,price;
	 String name;
	
	public
	void print()
	{ 
		Scanner obj=new Scanner(System.in);
		System.out.println("enter shooes name");
		name=obj.next();
		
		System.out.println("enter size");
		size=obj.nextInt();
		
		System.out.println("enter price");
		price=obj.nextInt();
		
	}
	void show()
	{
		System.out.println(" shooes name"+name);
		System.out.println("size"+size);
		System.out.println(" price"+price);
	}
	
	
public static void main(String[] args)

{
	
	shooes s1=new shooes();
	s1.print();
	s1.show();
}
	
	

}
