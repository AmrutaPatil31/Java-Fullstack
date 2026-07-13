package com.SIS.service;

import com.SIS.dao.StudentDao;
import com.SIS.entity.StudentEntity;

public class StudentService {
	public StudentEntity getStudent() {
		StudentDao dao=new StudentDao();
		StudentEntity info=dao.getStudent();
		return info;
	}
}
