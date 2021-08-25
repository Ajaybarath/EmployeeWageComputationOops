package com.bridgeLabz.employeeWage;

public class EmployeeWage {
	
	
	public static void main(String args[]) {

		EmployeeWage employee = new EmployeeWage();
		
		if (employee.checkAttendence()) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
		
		
	}
	
	public boolean checkAttendence() {
		
		int employeeAttendenceStatus = (int) (Math.floor(Math.random() * 10) % 2); // 1 means present, 0 means absent
		
		if (employeeAttendenceStatus == 0) {
			return false;
		}

		return true;

	}

}
