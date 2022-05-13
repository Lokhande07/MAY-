package com.mindgate.pojo;

import java.util.Scanner;

public class UserDetails {
	int userid;
	String name;
	int age;

	public void acceptUserDetails() {
		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Enter User Id");
			userid = scanner.nextInt();
			System.out.println("Enter Name");
			name = scanner.next();
			System.out.println("Enter Age");
			age = scanner.nextInt();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Invalid Input From User");
			System.out.println("Please enter valid values");
		} finally {
			System.out.println("Details Excepted !");
			scanner.close();
		}
	}

	public void displayUserDetails() {
		System.out.println(userid);
		System.out.println(name);
		System.out.println(age);
	}
}
