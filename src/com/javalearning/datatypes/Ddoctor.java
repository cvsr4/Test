package com.javalearning.datatypes;

//import com.sun.java.util.jar.pack.Package.Class.Method;


public class Ddoctor {
	//Static Variables
	static String name;
	static int age;
	static char Gender;
	static Double weight;
	//Non Static
	String hospital="abc";
	//Final
    final  String Disease="Fever";
    final static String Disease2="Cough";
	public static void main(String[] args) {
		Ddoctor ddoctor = new Ddoctor();
		name="sai";
		age=20;
		Gender='M';
		weight=65.8;
		//Non Static Variable Declaration with refrence name 
		ddoctor.hospital="xyz";
		
		//Local variable should  in main method and it should be initalized with value
		String Patient="xyz";
		System.out.println(name);
		//System.out.println(ddoctor.name);
		System.out.println(Ddoctor.name);
		System.out.println(ddoctor);
		System.out.println(Patient);
		//Non Stataic variable printing
		System.out.println(ddoctor.hospital);
		//final variable printing
		System.out.println(ddoctor.Disease);
		//System.out.println(Ddoctor.Disease);
		//Different types of variable calling and static final variable calling
           System.out.println(Disease2);
           System.out.println(Ddoctor.Disease2);
           //System.out.println(ddoctor.Disease2);
	}
}
