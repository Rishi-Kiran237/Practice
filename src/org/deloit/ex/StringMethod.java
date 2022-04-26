package org.deloit.ex;

public class StringMethod {

	public static void main(String[] args) {
	
		String name="Rishi";
		String name2="rishi";
		
	//can also use Replace method('R' to 'r')
		
	String newName=name.toLowerCase();
	System.out.println("newName is :: " + newName);
	
	boolean res=newName.equals(name2);
	
	System.out.println(res);
	
	

	}

}
