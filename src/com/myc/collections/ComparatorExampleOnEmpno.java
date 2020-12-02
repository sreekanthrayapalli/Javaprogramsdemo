package com.myc.collections;

import java.util.Comparator;

public class ComparatorExampleOnEmpno  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpno()-o2.getEmpno();
	}

}