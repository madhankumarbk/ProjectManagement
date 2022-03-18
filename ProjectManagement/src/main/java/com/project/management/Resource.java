package com.project.management;

import com.project.enumerations.DependencyStatus;

public class Resource {
	int id;
	String name;
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
	public DependencyStatus getStatus() {
		return status;
	}
	public void setStatus(DependencyStatus status) {
		this.status = status;
	}
	
}
