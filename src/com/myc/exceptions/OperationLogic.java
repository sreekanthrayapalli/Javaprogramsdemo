package com.myc.exceptions;

public class OperationLogic {

	public void div(String input1, String input2) throws ArithmeticException, NumberFormatException {
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		int c = a / b;
		System.out.println(c);

	}
	
	
	public void div1(String input1, String input2) throws ArithmeticException, NumberFormatException {
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		if(b<=0) {
			ArithmeticException ae = new ArithmeticException("-ve value");
			throw ae;
		}
		
		int c = a / b;
		System.out.println(c);

	}
	
	public void validateUser(String username, String password) throws LoginException{
		if(username.equals("admin") && password.equals("admin123")) {
			System.out.println("you can proceed..welcome user");
		}else {
			LoginException le = new LoginException("wrong details");
			throw le;
		}
	}
}
