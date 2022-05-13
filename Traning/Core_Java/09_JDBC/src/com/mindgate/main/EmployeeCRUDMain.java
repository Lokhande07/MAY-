package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount;
		String sqlQuery;
		Connection connection;
		PreparedStatement preparedStatement;
		// Statement statement;
//		System.out.println("Insert Example");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "INSERT into employee_details (name,salary) values (?,?)";
//			preparedStatement = connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Karan");
//			preparedStatement.setDouble(2, 2222);
//			resultCount = preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("Record INSERTED Successfully");
//			} else {
//				System.out.println("Failed to add record");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Connection Failed");
//			System.out.println(e.getMessage());
//		}

//		System.out.println("Update Example");
//
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			sqlQuery = "UPDATE employee_details SET name=?,salary=? where employee_id=?";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "RAMANAM");
//			preparedStatement.setDouble(2, 1554);
//			preparedStatement.setInt(3,5);
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if (resultCount > 0) {
//				System.out.println("UPDATE performed susscessfully");
//			} else {
//				System.out.println("Action failed");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("Exception");
//			System.out.println(e.getMessage());
//		}

		System.out.println("Delete ACtion");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			sqlQuery = "Delete employee_details where employee_id=?";
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, 7);
			resultCount=preparedStatement.executeUpdate();
			connection.close();
			if (resultCount > 0) {
				System.out.println("UPDATED successfully");
			} else {
				System.out.println("Action failed");
			}
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Exception of delete");
			System.out.println(e.getMessage());
		}

//		System.out.println("Get All Elements Action");
//		try {
//			Class.forName(driver);
//			connection = DriverManager.getConnection(url, user, password);
//			statement = connection.createStatement();
//			sqlQuery = "Select * from employee_details";
//			resultCount = statement.executeQuery(sqlQuery);
//
//			while (resultCount.next()) {
//				System.out.println(resultCount.getInt("EMPLOYEE_ID") + " " + resultCount.getString("NAME") + " "
//						+ resultCount.getDouble("SALARY"));
//
//			}
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//
//			System.out.println("Exception of delete");
//			System.out.println(e.getMessage());
//		}

	}

}
