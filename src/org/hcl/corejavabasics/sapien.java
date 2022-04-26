package org.hcl.corejavabasics;

public class sapien {
         
	//states represents as variables 
	int age;
	String name;
	String address;
	double salary;
	boolean married;
	int height;
	int weight;
	
	//behaviors represent as methods
	
	public void sapienEating() {

		System.out.println("sapien rishi Eating");	
		}
	public void sapienRunning() {
		 System.out.println("sapien rishi Running");
	}
	public void sapienSleeping() {
		System.out.println("sapien rishi sleeping");
	}
	public void sapienJumping() {
		System.out.println("sapien rishi jumping");	
	}		
	public static void main(String[] args) {
		
       System.out.println("Executing Main Method");		
       //object
       //ClassName reference=new ClassName
       sapien rishi=new sapien();
      System.out.println("rishi address is :: " + (rishi.address= "Hyderabad"));
      System.out.println("rishi age is :: " + (rishi.age=25));
      System.out.println("rishi weight is :: "+ (rishi.weight= 63));
      System.out.println("rishi married is :: "+(rishi.married=false));
      System.out.println("full name :: "+(rishi.name="Rishi kiran"));
      System.out.println(+(rishi.salary=10000));
      
       rishi.sapienEating();
       rishi.sapienRunning();      
       	   
	}

}
