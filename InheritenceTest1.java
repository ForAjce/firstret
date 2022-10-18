package com.cts.test;

import com.cts.model.CasualEmployee;
import com.cts.model.Employee;

public class InheritenceTest1 {

	public static void main(String[] args) {
		CasualEmployee casualEmployee = new CasualEmployee(101,"Raja",12345,23);
		casualEmployee.show();
		
		Employee employee = new CasualEmployee(102,"Raja",12345,23);
		
		//CasualEmployee casualEmployee1 = new Employee();

	}

}
