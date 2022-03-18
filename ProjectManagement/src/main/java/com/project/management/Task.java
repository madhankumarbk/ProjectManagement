package com.project.management;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import com.project.abstracts.Duration;
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
	LocalDateTime expectedEndTime;

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

	public LocalDateTime getExpectedEndTime() {
		return expectedEndTime;
	}

	public void setExpectedEndTime(LocalDateTime expectedEndTime) {
		this.expectedEndTime = expectedEndTime;
	}

	/**
	 * @return Actual remaining duration of tasks
	 */
	@Override
	public long getRemainingActualDuration() {
		return ChronoUnit.DAYS.between(LocalDateTime.now(), this.expectedEndTime);
	}

}
