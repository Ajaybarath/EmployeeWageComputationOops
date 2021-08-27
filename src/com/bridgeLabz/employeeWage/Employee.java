package com.bridgeLabz.employeeWage;

public class Employee {

	private static final int FullDayHours = 8;
	private static final int PartTimeHours = 4;

	String companyName = "";
	int noOfWorkingDays = 0;
	int employeeWagePerHour = 0;

	private int employeeWage = 0;
	private int workingHours = 0;
	
	public Employee(String companyName, int noOfWorkingDays, int employeeWagePerHour) {
		// TODO Auto-generated constructor stub
		
		this.companyName = companyName;
		this.noOfWorkingDays = noOfWorkingDays;
		this.employeeWagePerHour = employeeWagePerHour;
	}

	public int checkAttendence() {

		int employeeAttendenceStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means present, 0 means absent

		if (employeeAttendenceStatus == 0) {
			return 0;
		}

		return 1;

	}

	public void calculateWage() {

		switch (partTimeOrFullTimeCheck()) {
		case (1):
			employeeWage += employeeWagePerHour * FullDayHours;
			workingHours += FullDayHours;
			break;

		case (2):
			employeeWage += employeeWagePerHour * PartTimeHours;
			workingHours += PartTimeHours;
			break;

		default:
			employeeWage += 0;

		}

	}

	public int partTimeOrFullTimeCheck() {

		int employeeWorkStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means fulltime, 0 means partime

		if (checkAttendence() == 0) {
			return 0;
		}

		if (employeeWorkStatus == 0) {
			return 2;
		}

		return 1;
	}

	public void monthlyWageCalculation() {

		int workingDays = 0;

		while (workingHours < 100 && workingDays < noOfWorkingDays) {
			calculateWage();

			workingDays++;
		}

		System.out.println("Employee total working hour : " + workingHours);

		System.out.println("Employee wage calculated is " + employeeWage);

	}
}
