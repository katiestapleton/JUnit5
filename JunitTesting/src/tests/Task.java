/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 4 - Milestone
 */

package tests;

import java.util.concurrent.atomic.AtomicLong;

public class Task {
	private final String taskID;
	private String taskName;
	private String taskDesc;
	private static AtomicLong idGenerator = new AtomicLong();
	
	// Constructs Task information including requirements.
	// note: null values remain null for data integrity/placeholder
	public Task(String IDtask, String nameTask, String descTask) {
		// task ID generated when constructor is called. unique
		IDtask = String.valueOf(idGenerator.getAndIncrement());
		this.taskID = IDtask;
		
		// task name requirements
		if (nameTask.isBlank()) {
			nameTask = null;
		}
		else if (nameTask.length() > 20) {
			nameTask = nameTask.substring(0,20);
		}
		this.taskName = nameTask;
		
		// task description requirements
		if (descTask.isBlank()) {
			descTask = null;
		}
		else if (descTask.length() > 50) {
			descTask = descTask.substring(0, 50);
		}
		this.taskDesc = descTask;
	}

	// GETTERS AND SETTERS
	public String getTaskID() {
		return taskID;
	}

    // task name requirements
	public void setTaskName(String nameTask) {
		if (nameTask.isBlank()) {
			nameTask = null;
		}
		else if (nameTask.length() > 20) {
			nameTask = nameTask.substring(0,20);
		}
		this.taskName = nameTask;
	}
	
	public String getTaskName() {
		return taskName;
	}

    // task description requirements
	public void setTaskDesc(String descTask) {
		if (descTask.isBlank()) {
			descTask = null;
		}
		else if (descTask.length() > 50) {
			descTask = descTask.substring(0, 50);
		}
		this.taskDesc = descTask;
	}
	
	public String getTaskDesc() {
		return taskDesc;
	}

}

