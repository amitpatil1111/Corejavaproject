package constructor.java;
import java.util.*;
 class library 
{
 String name;
 int id;
 
 
 library()
  {
	 name="amit";
	 id=1;
  }
 library(String n,int i)
 {
	 name=n;
	 id=i;
 }

// library (String name,int id)
// {
//	 this.name=name;
//	 this.age=age;
// }
// library(library lib)
// {
//	 name=lib.name;
//	 id=lib.id;
// }
// public String toString()
// {
//	 return "name= "+name +" age= "+age;
// }
//  
// 
//}
 public static void main(String[] args)
 {
      library l1=new library();
	 library l2=new library("amit",24);
	 System.out.println( l1.name);
	 System.out.println(l1.id);
	 System.out.println(l2.name);
	 System.out.println(l2.id);
 } 
}
	 
//	 library l3=new library(l2);
//	 library l4=new library("raj",26);
//	 
	
//	 System.out.println(l3);
//	 System.out.println(l4);
//	 l1.name="vish";
//	 l1.age=26;
//	 System.out.println(l1);
	 
	 
 
 
