package interfaces;

import java.lang.*;
import classes.Patient;

public interface PatientOperations
{
	public boolean insertPatient(Patient p);
	public boolean removePatient(Patient p);
	public Patient searchPatient(int nid);
	public void showAllPatients();
}
