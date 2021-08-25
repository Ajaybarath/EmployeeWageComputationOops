package com.bridgeLabz.employeeWage;

public class EmployeeWage {
	
	private static final int EmployeeWagePerHour = 20;
	private static final int FullDayHours = 8;
	private static final int PartTimeHours = 4;
	
	public static void main(String args[]) {

		EmployeeWage employee = new EmployeeWage();
		
		employee.calculateWage(false);
		
	}
	
	public int checkAttendence() {
		
		int employeeAttendenceStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means present, 0 means absent
		
		if (employeeAttendenceStatus == 0) {
			return 0;
		}

		return 1;

	}
	
	public void calculateWage(boolean attendence) {
		int employeeWage = 0;
		int workingHours = 0;
		
		
		switch (partTimeOrFullTimeCheck()) {
		case (1):
			employeeWage += EmployeeWagePerHour * FullDayHours;
			workingHours += FullDayHours;
			System.out.println("Employee is present and his wage is " + employeeWage);
			break;

		case (2):
			employeeWage += EmployeeWagePerHour * PartTimeHours;
			workingHours += PartTimeHours;
			System.out.println("Employee is present and his wage is " + employeeWage);
			break;

		default:
			employeeWage += 0;
			System.out.println("Employee is absent");

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

}
