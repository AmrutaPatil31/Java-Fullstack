package com.EDS.Dao;

import com.EDS.Entity.EmployeeEntity;

public class EmployeeDao {
	public EmployeeEntity getEmployeeData(){
		EmployeeEntity employee=new EmployeeEntity(1,"Amruta","Salesforce");
		return employee;
	} 
}
