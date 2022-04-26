package org.deloit.ex;

public class Global_Local {
	int i=550;
   double j=2.50;
    double res;
    
   public void performAdd() {
	   double res=i+j;
	   System.out.println("resul for addition is ::"+res);
	   
   }
    public void performSub() {
    	double res=i-j;
   System.out.println("resul for subtraction is ::"+res);
   
   }
	public static void main(String[] args) {
		Global_Local data=new Global_Local();
	data.performAdd();
	data.performSub();
	

	}

}
