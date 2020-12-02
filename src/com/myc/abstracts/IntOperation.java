package com.myc.abstracts;

public class IntOperation extends Operation{
	
	 public IntOperation() {
		 System.out.println("default child intoperation");
	 }

	@Override
	public void performLogic() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("result is "+c);
	}

	
}
