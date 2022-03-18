package com.project.management;

import com.project.enumerations.DependencyStatus;

/**
 * @author mbaskaran
 * User Entity with require information.
 */
public class User {
	int id;
	String name;
	String email;
	String designation;
	DependencyStatus status;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public DependencyStatus getStatus() {
		return status;
	}
	public void setStatus(DependencyStatus status) {
		this.status = status;
	}
}
