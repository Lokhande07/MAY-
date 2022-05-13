package com.midgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		List<String> nameList = new ArrayList<String>();
		nameList.add("Shashank");
		nameList.add("Sahil");
		nameList.add("Sanket");
		arrayListDemo.setUserId(101);
		arrayListDemo.setNameList(nameList);
		System.out.println(arrayListDemo);

		System.out.println("-".repeat(50));

		List<Integer> numberList = new ArrayList<>();
		numberList.add(101);
		numberList.add(102);
		numberList.add(103);
		numberList.add(104);
		numberList.add(105);

		System.out.println(numberList);

		System.out.println("-".repeat(50));

		Employee employee1 = new Employee(101, "Shashank", 1000);
		Employee employee2 = new Employee(102, "Sahil", 1000);
		Employee employee3 = new Employee(103, "Sanket", 1000);
		Employee employee4 = new Employee(104, "Shashi", 1000);

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		System.out.println(employees);
		System.out.println("-".repeat(50));
		for (Employee employee : employees) {
			System.out.println(employee);

		}
	}

}
