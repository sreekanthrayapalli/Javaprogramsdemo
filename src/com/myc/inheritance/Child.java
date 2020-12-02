package com.myc.inheritance;

public class Child extends Parent{

	int c,d;
	Child(){
		c=30;
		d=40;
		System.out.println("Child Constructor");
	}
	
	Child(int c,int d){
		super(10,20);
		this.c = c;
		this.d= d;
		System.out.println("child paremeter Constructor");
		
	}
}
