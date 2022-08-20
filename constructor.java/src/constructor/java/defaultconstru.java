package constructor.java;

public class defaultconstru                 //student
{
	int rno;
	String name;
	
	defaultconstru()
	{
		name="abc";
		rno=2;
	}
	public static void main (String[] args)
	{
		defaultconstru d1=new defaultconstru();
		System.out.println(d1.name);
		System.out.println(d1.rno);
		
		
	}

}
