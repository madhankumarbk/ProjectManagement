package com.project.abstracts;

import java.util.List;

import com.project.enumerations.DependencyStatus;
import com.project.enumerations.WorkStatus;
import com.project.management.Resource;
import com.project.management.Task;
import com.project.management.User;

public abstract class Dependency {
	User user;
	List<Resource> resources;
	List<Task> dependentTask;
	
	boolean isUserAvailable() {
		return user.getStatus() == DependencyStatus.AVAILABLE;
	}
	
	boolean isResourcesAvailable() {
		return resources.stream().allMatch(resource -> resource.getStatus() == DependencyStatus.AVAILABLE);
	}
	
	boolean isDependentTasksCompleted() {
		return dependentTask.stream().allMatch(task -> task.getStatus() == WorkStatus.COMPLETED);
	}
	
	public boolean isAllDependencyResolved() {
		return isUserAvailable() && isResourcesAvailable() && isDependentTasksCompleted();
	}

}
