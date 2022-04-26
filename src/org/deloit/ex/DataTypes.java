package org.deloit.ex;

public class DataTypes {
	
	public void performAdd() {
		int i=25;
		int j=65;
		int res=i+j;
		System.out.println("Addition of i,j is : "+res);
	}
   public void performSub() {
	   double i=50.50;
	   int j=48;
	   double res=i-j;
	   System.out.println("Subtraction of i,j is :"+res);   
   }
   public void performMul() {
	   int m=25;
	   int n=52;
	   int res=m*n;
	   System.out.println("Multiplication of i,j is :"+res);
   }
      public static void main(String[] args) {
      System.out.println("The calculations are as follows ; ");
    	  DataTypes data=new DataTypes();
    	  data.performAdd();
    	  data.performSub();
    	  data.performMul();
    	  
}
}
