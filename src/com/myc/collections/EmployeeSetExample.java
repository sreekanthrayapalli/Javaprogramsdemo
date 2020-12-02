package com.myc.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeSetExample {

	public static void main(String[] args) {

		//List<Employee> list = new ArrayList<>();
		//Set<Employee> collection = new HashSet<>();
		SortedSet<Employee> collection = new TreeSet<>();
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(1, "abc");
		//Employee e2 = e1;
		
		System.out.println(e1.equals(e2));
		
		collection.add(new Employee(1, "abc"));
		collection.add(new Employee(2,"xyz"));
		collection.add(new Employee(3,"pqr"));
		
		collection.add(new Employee(1, "abc"));
		collection.add(new Employee(2,"xyz"));
		collection.add(new Employee(3,"pqr"));
		
		for(Employee e:collection) {
			System.out.println(e.getEmpno()+"   "+e.getEname());
		}
	}

}
