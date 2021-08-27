package com.bridgeLabz.employeeWage;

public class EmployeeWage {

	public static void main(String args[]) {

		Employee employee = new Employee("DMart", 25, 2);

		employee.monthlyWageCalculation();

		Employee employee2 = new Employee("Flipkart", 25, 2);

		employee2.monthlyWageCalculation();

		Employee employee3 = new Employee("Relaince", 25, 2);

		employee3.monthlyWageCalculation();
	}

}
