package org.hcl.oops;
//interface can be used for Multiple cell Inheritance
public class Cat implements Animal,Animal1 {

	public static void main(String[] args) {
		//like abstract we cannot create method for interface
		
		Animal a1=new Dog();
		Animal b1=new Cat();
		Animal1 b2=new Cat();
		
		a1.animalEating();
		a1.animalJumping();
		
		b1.animalEating();
		b1.animalJumping();
		
		b2.animalCrying();
		b2.animalSleeping();
		
		//we cannot change variables values in interface
		
	}
	@Override
	public void animalSleeping() {
		System.out.println("Cat is sleeping");
		
	}

	@Override
	public void animalCrying() {
		System.out.println("Cat is crying");
		
	}

	@Override
	public void animalEating() {
	System.out.println("Cat is Eating");
		
	}

	@Override
	public void animalJumping() {
		System.out.println("cat is jumping");
		
	}

}
