package com.app.pojos;

public class Ngo_Details {
	
	public int ngoId;
	public String name;
	public String address;
	public String catagory;
		
	public Ngo_Details(int ngoId, String name, String address, String catagory) {
		super();
		this.ngoId = ngoId;
		this.name = name;
		this.address = address;
		this.catagory = catagory;
	}
	public int getNgoId() {
		return ngoId;
	}
	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "Ngo_Details [ngoId=" + ngoId + ", name=" + name + ", address=" + address + ", catagory=" + catagory
				+ "]";
	}
		

}
