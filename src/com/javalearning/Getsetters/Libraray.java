package com.javalearning.Getsetters;

//import com.corejavaclass.datatypes.Doctor;

public class Libraray {
	
	//DemoMethods demomethods = new DemoMethods();
    	private String Lbname="cmr";
    	private int Lbooks=1000;
    	private char Racks='2';
	    
	    public static void main(String[] args)
	    {
	  Libraray library=new Libraray() ;
	  System.out.println(library);
	  
			  
	}

		public String getLbname() {
			return Lbname;
		}

		public void setLbname(String lbname) {
			Lbname = lbname;
		}

		public int getLbooks() {
			return Lbooks;
		}

		public void setLbooks(int lbooks) {
			Lbooks = lbooks;
		}

		public char getRacks() {
			return Racks;
		}

		@Override
		public String toString() {
			return "Libraray [Lbname=" + Lbname + ", Lbooks=" + Lbooks + ", Racks=" + Racks + "]";
		}

		public void setRacks(char racks) {
			Racks = racks;
		}
		
		//static Doctor calldoctor() {
     //Doctor ddoctor=new Doctor();	
     
    //return ddoctor;
		
		

}
