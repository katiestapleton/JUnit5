package tests;

public class Task {
	String taskID;
	String taskName;
	String taskDesc;
	
	public Task(String tkID, String tkName, String tkDesc) {
		// task objects. max character limits (10ch, 20ch, 50ch)
		this.taskID = tkID;
		this.taskName = tkName;
		this.taskDesc = tkDesc;
	}

}


/*
		taskID = "1234567890";
		taskName = "Nulla at odio proint";
		taskDesc = "Donec justo arcu, imperdiet ut urna sit amet morbi";

*/