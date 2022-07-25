package com.bean;

//constructor injection 

public class DoctorBean {

	AddressBean addressBean;
	String firstName;

	public DoctorBean(AddressBean addressBean) {
		System.out.println("DoctorBean::DoctorBean(AddressBean)");
		this.addressBean = addressBean;
	}

	public AddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
