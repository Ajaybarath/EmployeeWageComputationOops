package com.bridgeLabz.employeeWage;

public class EmployeeWage {

	public static void main(String args[]) {

		Employee employee1 = new Employee("DMart", 25, 2);

		employee1.monthlyWageCalculation();

		Employee employee2 = new Employee("Flipkart", 25, 2);

		employee2.monthlyWageCalculation();

		Employee employee3 = new Employee("Relaince", 25, 2);

		employee3.monthlyWageCalculation();
		
		System.out.println("Total employee wage for " + employee1.companyName + " is " + employee1.employeeWage);
		System.out.println("Total employee wage for " + employee2.companyName + " is " + employee2.employeeWage);
		System.out.println("Total employee wage for " + employee3.companyName + " is " + employee3.employeeWage);


	}

}
