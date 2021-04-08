/*
 * @author Katie Stapleton
 * SNHU 320 Testing
 * Module 4 - Milestone
 */

package tests;

public class Task {
	private String taskID;
	private String taskName;
	private String taskDesc;
	
	// task information (constructor)
	public Task(String tkID, String tkName, String tkDesc) {
		this.taskID = tkID;
		this.taskName = tkName;
		this.taskDesc = tkDesc;
	}

	// task ID: required, uniqueID, max 10ch, not null, not updatable
	public void setTaskID(String IDtask) {
		this.taskID = IDtask;
	}
	
	public String getTaskID() {
		return taskID;
	}

	// task name:  required, 
	public void setTaskName(String nameTask) {
		this.taskName = nameTask;
	}
	
	public String getTaskName() {
		return taskName;
	}

    // task description: required, max 30ch, not null
	public void setTaskDesc(String descTask) {
		this.taskDesc = descTask;
	}
	
	public String getTaskDesc() {
		return taskDesc;
	}

}

