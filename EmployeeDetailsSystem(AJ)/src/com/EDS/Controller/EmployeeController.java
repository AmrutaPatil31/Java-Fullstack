package com.EDS.Controller;

import com.EDS.Entity.EmployeeEntity;
import com.EDS.Service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeService();
		EmployeeEntity emp=service.getEmployee();
		System.out.println( emp);

	}

}
