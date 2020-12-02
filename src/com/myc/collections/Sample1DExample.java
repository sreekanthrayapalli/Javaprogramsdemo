package com.myc.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sample1DExample {

	public static void main(String[] args) {

//		ArrayList,LinkedList,HashSet,LinkedHashSet,TreeSet
	//	List<Integer> list = new ArrayList<>();//List Object
		//Set<Integer> list = new LinkedHashSet<>();//List Object
		SortedSet<Integer> list = new TreeSet<>();//List Object
		//Add some elements
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(21);
		list.add(11);
		list.add(32);
		list.add(20);
		list.add(15);
		list.add(37);
		list.add(20);
		list.add(10);
		list.add(33);
		System.out.println("size is "+list.size());
		System.out.println("here abc is "+list.contains("abc"));
		
		//display all elements
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("using foreach");
		//from java1.5
		//foreach
		for(Object obj: list) {
			System.out.println(obj);
		}
		//java1.8
		//using stream
		list.stream().forEach(System.out::println);
		
		
	}

}
