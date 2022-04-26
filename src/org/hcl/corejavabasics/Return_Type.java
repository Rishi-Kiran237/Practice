package org.hcl.corejavabasics;

public class Return_Type {

	public static int performAdd(int i, int j) {
		int result=i+j;
		return result;
	}
	public static double performSub(double m, double g) {
		double result=m-g;
		return result;
	}
	public static void performMul(int g, int f) {
		int result =g*f;
	System.out.println("Mult of g,f is :"+result);	
	}
	public static void main(String[] args) {
		System.out.println("Calculations for return method is :");
		
		int res1=performAdd(25, 20);
		System.out.println("Add of i,j is ::"+res1);
		double res2=performSub(10.50, 8.35);
		System.out.println("Sub of m,g is ::"+res2);
		performMul(res1, 10);
		
	}

}
