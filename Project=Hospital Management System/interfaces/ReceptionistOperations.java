package interfaces;

import java.lang.*;
import classes.Receptionist;

public interface ReceptionistOperations
{
	public boolean insertReceptionist(Receptionist r);
	public boolean removeReceptionist(Receptionist r);
	public Receptionist searchReceptionist(int id);
	public void showAllReceptionists();
}
