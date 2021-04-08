package tests;

public class Task {
	private String taskID;
	private String taskName;
	private String taskDesc;
	
	public Task(String tkID, String tkName, String tkDesc) {
		// task objects. max character limits (10ch, 20ch, 50ch)
		this.taskID = tkID;
		this.taskName = tkName;
		this.taskDesc = tkDesc;
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String IDtask) {
		this.taskID = IDtask;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String nameTask) {
		this.taskName = nameTask;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String descTask) {
		this.taskDesc = descTask;
	}

}

