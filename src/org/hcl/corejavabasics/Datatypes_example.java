package org.hcl.corejavabasics;

public class Datatypes_example {
	
	public void performAdd() {
		
	//integer is data type,i is variable and initialized value '10'
			int i=10;
	//integer is data type, i is variable and initialized value 20
		    int j=20;
		    
		int result=i+j;
		
		System.out.println("Addition of i=10,j=20 is :: "+ (result));
	
		i=100;
	
		j=200;
		
		result=i+j;
		
		System.out.println("addition i=100, j=200 is ::"+result);
			
	}
	
	public void performSub( ) {	
		int i=20;
		int j=10;
		int result=i-j;
		System.out.println("Subtraction of i,j is:: "+(result));
	}
	 public void performMul() {	 
    	 int i=20;
    	 int j=30;
    	 int result=i*j;
   System.out.println("Multiplication of i, j, is :: "+(result));
   
     }
     
     public static void main(String[] args) {
		
       System.out.println("Execution started from main method");
       
       Datatypes_example data=new Datatypes_example();
       
       data.performAdd();
       
       data.performSub();
       
       data.performMul();
	}

}
