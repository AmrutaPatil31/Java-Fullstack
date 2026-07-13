package com.SIS.controller;

import com.SIS.entity.StudentEntity;
import com.SIS.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		StudentService service=new StudentService();
		StudentEntity student=service.getStudent();
		System.out.println(student);

	}

}
