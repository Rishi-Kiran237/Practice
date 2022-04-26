package org.hcl.corejavabasics;

public class Conditional {

	public static void main(String[] args) {
		 int total=55;
		 char grade='B';
		 
		 if(total==85 && grade=='A') {
			 System.out.println("eligble to apply for the job");		 
		 }if (total==75 && grade=='B') {
			 System.out.println("eligble to apply for the job"); 
		 }else if(total<=65 && grade <='c') {
			 System.out.println("not eligible to apply");
		 }
		 
		 

	}

}
