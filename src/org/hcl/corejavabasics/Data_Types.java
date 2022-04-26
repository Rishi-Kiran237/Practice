package org.hcl.corejavabasics;

public class Data_Types {
	
	public void performAdd() {
		
		int i=25;
		int j=55;
		int result=i+j;
  System.out.println("the addition of i,j is ::"+ result);	
	}
	
	public void performSub() {
		double i=25.55;
		int j=25;
		double result=i-j;
		System.out.println("subtraction value of i,j is::"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Calculating the result:");

      Data_Types data=new Data_Types();
      
     data.performAdd();
     data.performSub();
    		  








   
	}

}
