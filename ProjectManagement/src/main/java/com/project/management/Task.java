package com.project.management;

import java.util.List;

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
	User user;
	List<Resource> resources;
	List<Task> dependentTask;

	public List<Task> getDependentTask() {
		return dependentTask;
	}

	public void setDependentTask(List<Task> dependentTask) {
		this.dependentTask = dependentTask;
	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	boolean isTaskCanBeStarted() {
		return DependencyStatus.AVAILABLE == user.getStatus() && resources.stream().allMatch(resource -> resource.status == DependencyStatus.AVAILABLE) &&
				dependentTask.stream().allMatch(task -> task.status == WorkStatus.COMPLETED);
	}

}
