package com.corejavalearning.Aabstract;


interface A
{
	void Adisplay() ;
	void Ashow();
}
interface B
{
	void Bdisplay();
	void  Bshow();
	//void bbbshow();
}
class AB implements A,B
{
	public void Adisplay()
	{
		System.out.println("A Display ");
	}
	public void Ashow()
	{
		System.out.println("A show ");
	}
		public void Bdisplay()
		{
			System.out.println("A Display ");
		}
		public void  Bshow()
		{
			System.out.println("B Display ");
		}

}
class Aa implements  A
{
	public void Adisplay() {
		
		System.out.println("Aa Display ");
		
	}
	
	public void Ashow()
	{
		System.out.println("Aa show ");
	}
	
}
class Bb implements B
{
	public void Bdisplay()
	{
		System.out.println("A Display ");
	}
	//public void  Bshow()
	{
		System.out.println("B Display ");
	}
}


public class ABC {
	public static void main(String[] args)
	{
		AB obj =new AB();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();
		
		Aa obj2 = new Aa();
		obj2.Adisplay();
		obj2.Ashow();

	}

}
