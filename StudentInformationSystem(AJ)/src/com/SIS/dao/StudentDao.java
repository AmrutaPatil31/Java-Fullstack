package com.SIS.dao;
import com.SIS.entity.StudentEntity;
public class StudentDao {
	public StudentEntity getStudent() {
		StudentEntity st=new StudentEntity(1,"Sanika","CSE");
		return st;
	}
}
