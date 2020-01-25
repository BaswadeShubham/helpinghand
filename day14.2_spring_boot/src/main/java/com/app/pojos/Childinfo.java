package com.app.pojos;

import java.util.Date;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="child_info")
public class Childinfo {  
	
	private Integer childId;
	private String Name;
	private Integer Age;
	private String Gender;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date Dob;
	private String ngoId;
	
	@OneToOne(mappedBy = "childInfo",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private PaymentGateway p = new PaymentGateway();
	
	/*
	 * public PaymentGateway getPaymentGateway() { return paymentGateway; } public
	 * void setPaymentGateway(PaymentGateway paymentGateway) { this.paymentGateway =
	 * paymentGateway; }
	 */
	public Childinfo()
	{
		super();
	}
	public Childinfo(Integer childId, String name, Integer age, String gender, Date dob, String ngoId) {
		super();
		this.childId = childId;
		Name = name;
		Age = age;
		Gender = gender;
		Dob = dob;
		this.ngoId = ngoId;
	}
	
	
	public Childinfo(Integer childId) {
		super();
		this.childId = childId;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="child_id")
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
	}
	
	@Column(length = 20)
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Column(name="age")
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Column(name="DateOfBirth")
	@Temporal(TemporalType.DATE)
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getNgoId() {
		return ngoId;
	}
	public void setNgoId(String ngoId) {
		this.ngoId = ngoId;
	}
	@Override
	public String toString() {
		return "Childinfo [childId=" + childId + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Dob="
				+ Dob + ", ngoId=" + ngoId + "]";
	}
	
	

	
}
