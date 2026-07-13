package com.EDS.Service;

import com.EDS.Dao.EmployeeDao;
import com.EDS.Entity.EmployeeEntity;

public class EmployeeService {
	public EmployeeEntity getEmployee() {
		EmployeeDao dao=new EmployeeDao();
		EmployeeEntity e=dao.getEmployeeData();
		return e;
	} 
}
