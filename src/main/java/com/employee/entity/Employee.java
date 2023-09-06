package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_details")
public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", gender=" + gender
				+ "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int age;
	private String name;
	private int salary;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	

}
