package interfaces;

import java.lang.*;
import classes.Doctor;

public interface DoctorOperations
{
	public boolean insertDoctor(Doctor d);
	public boolean removeDoctor(Doctor d);
	public Doctor searchDoctor(int id);
	public void showAllDoctors();
}
