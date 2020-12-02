package com.myc.inheritance;

public class Parent {

	int a,b;
	Parent(){
		a=10;
		b=20;
		System.out.println("Parent constructor");
//done
	}
	
	Parent(int a,int b){
		this.a = a;
		this.b= b;
		System.out.println("Parent parameter constructor");
	}
	
}
