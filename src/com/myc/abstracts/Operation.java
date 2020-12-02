package com.myc.abstracts;

public abstract class Operation {
	
	public Operation() {
		System.out.println("default parent");
	}

	abstract public void performLogic();
}
