package com.myc.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeSortedExample {

	public static void main(String[] args) {
		SortedSet<Employee> collection = new TreeSet<>(new ComparatorExampleEmployee());

		SortedSet<Employee> collection2 = new TreeSet<>(new ComparatorExampleOnEmpno());
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(1, "abc");
		// Employee e2 = e1;

		System.out.println(e1.equals(e2));

		collection.add(new Employee(1, "abc"));
		collection.add(new Employee(0, "xyz"));
		collection.add(new Employee(3, "pqr"));

		collection.add(new Employee(1, "abc"));
		collection.add(new Employee(2, "xyz2"));
		collection.add(new Employee(3, "pqr3"));

		collection2.add(new Employee(1, "abc"));
		collection2.add(new Employee(0, "xyz"));
		collection2.add(new Employee(3, "pqr"));

		collection2.add(new Employee(1, "abc"));
		collection2.add(new Employee(2, "xyz2"));
		collection2.add(new Employee(3, "pqr3"));
		System.out.println("Based On Employee name");

		for (Employee e : collection) {
			System.out.println(e.getEmpno() + "   " + e.getEname());
		}

		System.out.println("Based On Employee number");

		for (Employee e : collection2) {
			System.out.println(e.getEmpno() + "   " + e.getEname());
		}
	}

}
