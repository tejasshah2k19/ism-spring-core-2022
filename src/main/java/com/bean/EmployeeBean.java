package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeBean implements InitializingBean,DisposableBean {

	Integer empId;
	String firstName;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	EmployeeBean() {
		System.out.println("EmployeeBean::EmployeeBean()");
	}

	public void afterPropertiesSet() {
		System.out.println("EmployeeBean::afterPropertiesSet()");
	}
	
	public void init() {
		System.out.println("EmployeeBean::init()");
	}

	public void destroy() throws Exception {
		System.out.println("EmployeeBean::destroy()");
		
	}
}
