package com.midgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		SortedMap<Integer, String> employeeMap = new TreeMap<Integer, String>();
		employeeMap.put(109, "Pravin");
		employeeMap.put(156, "Pratap");
		employeeMap.put(142, "Prachi");
		employeeMap.put(121, "Pravin");

		System.out.println(employeeMap);

	}

}
