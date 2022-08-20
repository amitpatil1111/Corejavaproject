package constructor.java;

public class bike1 
{
 public 
  void run()
  {
	 System.out.println("running");
  }
}
  class honda extends bike1
 {
	 public 
	 void run()
	  {
		 System.out.println("running safely 100 kmph");
	  }
	  public static void main(String[] args)
	  {
	  honda h1=new honda();
	  h1.run();
	 
      }
 
}
