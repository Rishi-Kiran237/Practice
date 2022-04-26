package org.hcl.corejavabasics;

public class ArgumentMethod {
	
	public static void performAdd(int i,int j){
		int result=i+j;
		System.out.println("Addition result of i,j is ::"+result);		
	}
	public static void performMul(double m, int j) {
		double result =m*j;
		System.out.println("Mul result of m,j is ::"+result);	
	}
	public void performSub(int g,int f) {
		int result =g-f;
		System.out.println("Sub result of g,f is ::"+result);
	}

	public static void main(String[] args) {
          
		System.out.println("the total calculations are:");
		
		ArgumentMethod data=new ArgumentMethod();
		data.performSub(52, 25);
		performAdd(550, 250);
		performMul(2.5, 50);

	}

}
