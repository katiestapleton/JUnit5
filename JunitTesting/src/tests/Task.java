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
	
	// task information (constructor)
	public Task(String tkID, String tkName, String tkDesc) {
		tkID = String.valueOf(idGenerator.getAndIncrement());
		this.taskID = tkID;
		this.taskName = tkName;
		this.taskDesc = tkDesc;
	}

	// task ID: required, uniqueID, max 10ch, not updatable, not null
    // task ID is NOT updatable. no setter allowed
	public String getTaskID() {
		return taskID;
	}

	// task name:  required, max 20ch, not null
	public void setTaskName(String nameTask) {
		nameTask = null;
		this.taskName = nameTask;
	}
	
	public String getTaskName() {
		return taskName;
	}

    // task description: required, max 50ch, not null
	public void setTaskDesc(String descTask) {
		descTask = null;
		this.taskDesc = descTask;
	}
	
	public String getTaskDesc() {
		return taskDesc;
	}

}

