package org.hcl.oops;
//class can use only single cell inheritance
public class execution extends Human{

	public static void main(String[] args) {
		 
		 Human Rishi= new Rishi();
		System.out.println(Rishi.age=25);
		System.out.println(Rishi.address="Kothagudem");
		System.out.println(Rishi.name="Rishi kiran S");
		System.out.println(Rishi.salary=10.25);
		 
		 Rishi.humanCrying();
		 Rishi.humanEating();
		 Rishi.humanJumping();
		 Rishi.humanSleeping();
		 
		Human Ravi=new Ravi();
		
		System.out.println(Ravi.age=26);
		System.out.println(Ravi.name="Ravi kumar P");
		System.out.println(Ravi.address="Hyderabad");
		System.out.println(Ravi.salary=25.10);
		
		Ravi.humanEating();
		Ravi.humanCrying();
		Ravi.humanJumping();
		Ravi.humanSleeping();
		 
	}
	
	@Override
	public void humanJumping() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void humanSleeping() {
		// TODO Auto-generated method stub
		
	}

}
