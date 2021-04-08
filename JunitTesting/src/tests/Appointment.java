package tests;

import java.time.LocalDate;

public class Appointment {
    String apptID;
    String apptDesc;
	LocalDate apptDate;
	
	
	public Appointment(String apID, String apDesc, LocalDate apDate) {
		// appointment objects. max characters (10ch, 50ch, DATE)
		this.apptID = apID;
		this.apptDesc = apDesc;
		this.apptDate = apDate;
	}
}
	/*
	
	apptID = "1234567890";
	apptDesc = "Cras suscipit lacus ut mi rutrum, vitae vestibulum";
	apptDateNow = LocalDate.now();

    Appointment appt0 = new Appointment();
    Appointment appt1 = new Appointment();
}
*/