package org.deloit.ex;

public class Human {
	
	String name;
	int age;
	String address;
	boolean married;
	double salary;
	double height;
	int weight;
	
	
	public void HumanRishi_Eating(){
		System.out.println("Human Rishi_Eating");
	}

	public static void main(String[] args) {
System.out.println("Full details of the applicant ::");
System.out.println("");
System.out.println("");

		Human rishi=new Human();
		
	System.out.println("Full name is :: "+(rishi.name="Rishi kiran"));
	System.out.println("Present Age is :: "+(rishi.age=25));
	System.out.println("Present Address is :: "+(rishi.address="hyderabad"));
	System.out.println("Married ::"+(rishi.married=false));
	System.out.println("Monthly income is :: "+(rishi.salary=25.52));
	
	
	
		
		

	}

}
