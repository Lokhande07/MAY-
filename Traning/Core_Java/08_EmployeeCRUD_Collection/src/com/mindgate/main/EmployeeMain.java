package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.DAO.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		int choice;
		int employeeId;
		String name;
		Double salary;
		String continueChoice;

		EmployeeDAO employeeDAO = new EmployeeDAO();

		Scanner scanner = new Scanner(System.in);
		do {

			System.out.println("Please Enter Choice");
			System.out.println("1.Add New Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.delete ID");
			System.out.println("4.GET single id");
			System.out.println("5.Get All Employee");

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Add new Employee");
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				if ((employeeDAO.addNewEmployee(new Employee(employeeId, name, salary)))) {
					System.out.println("Add Successfully");
				}
				break;

			case 2:
				System.out.println("Update Employee");
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				if (employeeDAO.updateEmployee(new Employee(employeeId, name, salary))) {
					System.out.println("Updated successfully");
				}
				break;

			case 3:
				System.out.println("Delete Employee by ID");
				employeeId = scanner.nextInt();
				employeeDAO.deleteEmployeeByEmployeeId(employeeId);
				break;

			case 4:
				System.out.println("Get Employee By ID");
				employeeId = scanner.nextInt();
				
				Employee emp = employeeDAO.getEmployeeByEmployeeId(employeeId);
				System.out.println(emp);
				System.out.println(employeeDAO.getEmployeeByEmployeeId(employeeId));
				break;

			case 5:
				System.out.println("Get All Employee Data");
				for (Employee emp1 : employeeDAO.getAllEmployees()) {
					System.out.println(emp1);

				}
				break;
			default:
				System.out.println("Invalid Number");
			}
			System.out.println("Do you want to continue?YES/NO");
			continueChoice = scanner.next();

		} while (continueChoice.equalsIgnoreCase("Yes"));
		System.out.println("You have Exit from the System ");
	}

}
