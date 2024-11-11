package interfaces;

import java.lang.*;
import classes.Staff;

public interface StaffOperations
{
	public boolean insertStaff(Staff s);
	public boolean removeStaff(Staff s);
	public Staff searchStaff(int id);
	public void showAllStaffs();
}

