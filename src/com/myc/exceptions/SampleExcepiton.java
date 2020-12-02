package com.myc.exceptions;

import java.util.Scanner;

import com.myc.abstracts.Operation;

public class SampleExcepiton {

	public static void main(String[] args) {
		OperationLogic ol = new OperationLogic();
		try {
			ol.validateUser("admin", "admin");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
