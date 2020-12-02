package com.myc.abstracts;

public class FloatOperation  extends Operation{

	@Override
	public void performLogic() {
		float a=10.78f,b=20.45f,c;
		c=a+b;
		System.out.println("result is "+c);
	}

	
}
