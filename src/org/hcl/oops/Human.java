package org.hcl.oops;

public abstract class Human {
		
		int age;
		String name;
		String address;
		double salary;
		
		public void humanEating() {
			System.out.println("HumanEating");
		}
	   public abstract void humanJumping();
	   

	   public void humanCrying() {
		   System.out.println("Human crying");
	   }
	   public abstract void humanSleeping();
	}

