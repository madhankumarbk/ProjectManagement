package com.project.abstracts;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Duration {
	protected LocalDateTime startTime;
	protected LocalDateTime endTime;
	
	public long getRemainingDuration() {
		return ChronoUnit.DAYS.between(LocalDateTime.now(), endTime);
	}

	public long getTotalDuration() {
		return ChronoUnit.DAYS.between(startTime, endTime);
	}
}
