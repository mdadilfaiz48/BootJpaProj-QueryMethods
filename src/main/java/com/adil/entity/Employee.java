package com.adil.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="employee2")
@Data
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String empName;
	private String job;
	private Double salary;
	private Integer deptId;
	
	public Employee() {
		System.out.println("Employee:: 0-param constructor");
	}

}
