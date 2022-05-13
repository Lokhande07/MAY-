package com.mindgate.DAO;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();

	// add new employee
	public boolean addNewEmployee(Employee employee) {
		return employeeSet.add(employee);
	}

	// update existing employee
	public boolean updateEmployee(Employee employee) {
		for (Employee setEmployee : employeeSet) {
			if(setEmployee.getEmployeeId() == employee.getEmployeeId()) {
			setEmployee.setName(employee.getName());
			setEmployee.setSalary(employee.getSalary());			
			return true;
		}}
		return false;
	}

	// delete employee
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee delemployee : employeeSet) {
			if(delemployee.getEmployeeId()==employeeId) {
				employeeSet.remove(delemployee);
				return true;
			}
			
		}
		
		return false;
	}

	// get single employee by employee id
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee getemployee : employeeSet) {
			if(getemployee.getEmployeeId()==employeeId) {
				return getemployee;
			}
			
		}
		
		return null;
	}

	// get all the employees
	public Set<Employee> getAllEmployees() {
		return employeeSet;
	}
}
