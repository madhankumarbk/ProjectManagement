package com.project.Interfaces;

import com.project.enumerations.WorkStatus;

/**
 * @author mbaskaran
 * Interface to be implemented on project & task class to get status & ramining duration of task or project.
 */
public interface Tracking {
	WorkStatus trackByStatus();
	int trackByDuration();
}
