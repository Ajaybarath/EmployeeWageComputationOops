package com.bridgeLabz.employeeWage;

public class EmployeeWage implements EmployeeWageBuilder {

	Employee[] employeeArray = new Employee[5];
	int noOfCompany = 0;

	public static void main(String args[]) {

		EmployeeWage employeeWage = new EmployeeWage();
		employeeWage.addEmployeeArray(new Employee("DMart", 25, 2));
		employeeWage.addEmployeeArray(new Employee("Flipkart", 25, 2));
		employeeWage.addEmployeeArray(new Employee("Relaince", 25, 2));
		
		employeeWage.getTotalEmployeeWage();
	}

	public void addEmployeeArray(Employee employee) {

		employeeArray[noOfCompany] = employee;
		employee.monthlyWageCalculation();
		noOfCompany++;

	}

	public void getTotalEmployeeWage() {
		for (int i = 0; i < noOfCompany; i++) {
			System.out.println(
					"Total employee wage for " + employeeArray[i].companyName + " is " + employeeArray[i].employeeWage);
		}
	}

}
