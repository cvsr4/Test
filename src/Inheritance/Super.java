package Inheritance;

//import sun.security.mscapi.CKeyStore.MY;

//This is example for super class,constructor,overriding and overloading,polymporphism
class Parent {

	 int a=10;//
	 //ovrriding 
	 void exmpoveriding()
	 {
		 System.out.println("Overriding to do ");
	 }
	// overloading with method name exoverloading
	  void exmpoverloading()
	  {
		  System.out.println("no phone number");
	  }
     
	 
	String display()
	{
		System.out.println("I am from one Parent");
		return null;
	}
	// Creating a constructor
	Parent()
	{
		String s ="vinayak";
		System.out.println("My name is" +s);
	}
	String name;
	int rno;
	//constructor with parameters with 
	Parent(int st,String n)
	{
	name =n;
	rno=st;
	}
}
//////////////////////////////////////////////////////
class Child extends Parent
{
	//overiding 
	void exmpoveriding()
	{
      System.out.println("Overriding is done");		
	}
	String num;
   //overloading example
	void exmpoverloaing(String f)
	{
		num=f;
	}
	
	int a=15;
	Child()
	{
	System.out.println("My name is :Sampath");	
	}
	
	
	String display()
	{
		System.out.println("I am for one Child");
	    System.out.println(a);
	    System.out.println(super.a);
		return super.display();
	    
	    
	}
}
class Super {

public static void main(String args[]) {
	// TODO Auto-generated method stub
	Child child = new Child();
	child.display();
	Parent parent=new Parent(1,"sampath");
	System.out.println(parent.name);
	System.out.println(parent.rno);
	// child.display();
	 child.exmpoveriding();
	 child.exmpoverloaing("9908764322");
	 System.out.println("my number is:" + child.num);
	 
	 
	
}
}


   



