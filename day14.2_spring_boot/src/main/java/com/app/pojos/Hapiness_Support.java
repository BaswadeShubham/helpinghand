package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="happiness_details")
public class Hapiness_Support {
	//Properties
	private int H_id;
	private LocalDate time;
	private String location;
	private int User_id;
	private int Ngo_id;
	//Default Constructor
	public Hapiness_Support() {
		super();
	}
	// Constructor
	public Hapiness_Support(int h_id, LocalDate time, String location, int u_id, int n_id) {
		super();
		H_id = h_id;
		this.time = time;
		this.location = location;
		User_id = u_id;
		Ngo_id = n_id;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="happiness_id")
	public int getH_id() {
		return H_id;
	}
	public void setH_id(int h_id) {
		H_id = h_id;
	}
	public LocalDate getTime() {
		return time;
	}
	public void setTime(LocalDate time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int u_id) {
		User_id = u_id;
	}
	public int getNgo_id() {
		return Ngo_id;
	}
	public void setNgo_id(int n_id) {
		Ngo_id = n_id;
	}
	//toString
	@Override
	public String toString() {
		return "Hapiness_Support [H_id=" + H_id + ", time=" + time + ", location=" + location + ", U_id=" + User_id
				+ ", N_id=" + Ngo_id + "]";
	}
	
	

}
