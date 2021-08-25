package com.bridgeLabz.employeeWage;

public class EmployeeWage {
	
	private static final int EmployeeWagePerHour = 20;
	private static final int FullDayHours = 8;
	private static final int PartTimeHours = 4;
	
	public static void main(String args[]) {

		EmployeeWage employee = new EmployeeWage();
		
		employee.calculateWage(false);
		
	}
	
	public boolean checkAttendence() {
		
		int employeeAttendenceStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means present, 0 means absent
		
		if (employeeAttendenceStatus == 0) {
			return false;
		}

		return true;

	}
	
	public void calculateWage(boolean attendence) {
		int employeeWage = 0;
		
		if (checkAttendence()) {
			if (partTimeOrFullTimeCheck()) {
				employeeWage += EmployeeWagePerHour * PartTimeHours;
			}
			else {
				employeeWage += EmployeeWagePerHour * FullDayHours;	
			}
			
			System.out.println("Employee is present and his wage is " + employeeWage);
		}
		else {
			System.out.println("Employee is absent");
		}

	}
	
	public boolean partTimeOrFullTimeCheck() {
		
		int employeeWorkStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means fulltime, 0 means partime

		if (employeeWorkStatus == 0) {
			return false;
		}
		
		return true;
	}

}
