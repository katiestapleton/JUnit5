package tests;

import java.time.LocalDate;

public class Appointment {
    private String apptID;
    private String apptDesc;
	private LocalDate apptDate;
	
	
	public Appointment(String apID, String apDesc, LocalDate apDate) {
		// appointment objects. max characters (10ch, 50ch, DATE)
		this.apptID = apID;
		this.apptDesc = apDesc;
		this.apptDate = apDate;
	}


	public String getApptID() {
		return apptID;
	}


	public void setApptID(String IDappt) {
		this.apptID = IDappt;
	}


	public String getApptDesc() {
		return apptDesc;
	}


	public void setApptDesc(String descAppt) {
		this.apptDesc = descAppt;
	}


	public LocalDate getApptDate() {
		return apptDate;
	}


	public void setApptDate(LocalDate DateAppt) {
		this.apptDate = DateAppt;
	}
}
