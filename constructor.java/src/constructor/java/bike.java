package constructor.java;
import java.util.*;
public class bike 
{
	 int speedlimit=90;
	public void run()
	{
		speedlimit=400;
		System.out.println("speedlimit="+speedlimit);
		
	}
	public static void main(String[] args)
	{
		bike b1=new bike();
		b1.run();
	}

}
