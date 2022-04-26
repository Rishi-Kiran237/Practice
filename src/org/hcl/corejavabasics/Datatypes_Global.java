package org.hcl.corejavabasics;

public class Datatypes_Global {
  //global or instance variable
	
	 int i=54;
	 int j=21;
	 
	 int result;

  public void performAdd() {
	  int k=25;
	  result=i+j+k;
	  
	  System.out.println("Add of i,j,k is ::"+result);
  }
  
  public void performSub() {
	  result=i-j;
    System.out.println("Sub of i,j is :: "+ result);
	    
  }
	  
	public void performMul() {
		
	 result=i*j;
	 
   System.out.println("Mul of i,j is ::"+result);
  
  }
	  
	public static void main(String[] args) {
		
  System.out.println("Executing Main Method");
  
   Datatypes_Global data=new Datatypes_Global();    
   data.performAdd();
   data.performSub();
   data.performMul();
	}

}
