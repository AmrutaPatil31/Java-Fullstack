package com.SIS.entity;

public class StudentEntity {
	int id;
	String name;
	String course;
	public StudentEntity(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
}
