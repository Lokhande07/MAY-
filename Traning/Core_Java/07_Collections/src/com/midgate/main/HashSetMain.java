package com.midgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Shashank");
		nameSet.add("Lokhande");
		nameSet.add("Ganesh");
		nameSet.add("Shashank");
		nameSet.add("Ganesh");
		nameSet.add("Rohit");

		System.out.println(nameSet);

		System.out.println("-".repeat(50));

		Employee employee1 = new Employee(3, "shank", 100);
		System.out.println(employee1.hashCode());

		Employee employee2 = new Employee(1, "lok", 420);
		System.out.println(employee2.hashCode());

		Employee employee3 = new Employee(2, "Adaf", 343);
		System.out.println(employee3.hashCode());

		Employee employee4 = new Employee(3, "shank", 100);
		System.out.println(employee4.hashCode());

		Set<Employee> employeeset = new HashSet<Employee>();

		employeeset.add(employee1);
		employeeset.add(employee2);
		employeeset.add(employee3);
		employeeset.add(employee4);

		for (Employee employee : employeeset) {
			System.out.println(employee);
		}
		
		Integer a=586;                   //char and Integer value have same hascode
		System.out.println(a.hashCode());
		
		String b="a";
		System.out.println(b.hashCode());

	}

}
