package com.project.management;

import java.util.List;

import com.project.abstracts.Dependency;
import com.project.abstracts.Duration;
import com.project.enumerations.DependencyStatus;
import com.project.enumerations.WorkStatus;

/**
 * @author mbaskaran
 * Task class with task id, description, status, assigned user, list of resources needed.
 * Override gettotalduration & remaining duration of tasks
 */
public class Task extends Duration{
	int id;
	String description;
	WorkStatus status;
	Dependency dependency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WorkStatus getStatus() {
		return status;
	}

	public void setStatus(WorkStatus status) {
		this.status = status;
	}

	
	boolean isTaskCanBeStarted() {
		return dependency.isAllDependencyResolved();
	}

}
