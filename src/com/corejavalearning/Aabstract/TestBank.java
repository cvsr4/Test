package com.corejavalearning.Aabstract;

abstract class Bank
{
abstract int getRateOfInterest();    
}    
class SBI extends Bank
{    
int getRateOfInterest()
    {
	return 7;
	}    
}    
class PNB extends Bank
 {    
int getRateOfInterest()
    {
	return 8;
	}    
}    
    
class TestBank
{    
public static void main(String args[])
{    
	//here we are creating just one object for parent class 
	Bank b;
	b = new SBI();
	
//Bank b =new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");   
     b=new PNB();
Bank b1=new PNB();  
System.out.println("Rate of Interest is: "+b1.getRateOfInterest()+" %");    
}}    
