package classes;

import java.lang.*;
import interfaces.*;

public class Hospital implements DoctorOperations,ReceptionistOperations,StaffOperations
{
	private String name;
	private String address;
	Doctor doctors[] = new Doctor[500];
	Receptionist receptionists[] = new Receptionist[500];
	Staff staffs[] = new Staff[500];
	
	public Hospital(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void setName(String name){this.name = name;}
	public void setAddress(String address){this.address = address;}
	
	public String getName(){return name;}
	public String getAddress(){return address;}
	
	public boolean insertDoctor(Doctor d)
	{
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] == null)
			{
				doctors[i] = d;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeDoctor(Doctor d)
	{
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] == d)
			{
				doctors[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Doctor searchDoctor(int id)
	{
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				if(doctors[i].getId()==id)
				{
					return doctors[i];
				}
			}
		}
		return null;
	}
	
	public void showAllDoctors()
	{
		for(int i=0; i<doctors.length; i++)
		{
			if(doctors[i] != null)
			{
				doctors[i].showDetails();
			}
		}
	}
	
	public boolean insertReceptionist(Receptionist r)
	{
		for(int i=0; i<receptionists.length; i++)
		{
			if(receptionists[i] == null)
			{
				receptionists[i] = r;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeReceptionist(Receptionist r)
	{
		for(int i=0; i<receptionists.length; i++)
		{
			if(receptionists[i] == r)
			{
				receptionists[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Receptionist searchReceptionist(int id)
	{
		for(int i=0; i<receptionists.length; i++)
		{
			if(receptionists[i] != null)
			{
				if(receptionists[i].getId()==id)
				{
					return receptionists[i];
				}
			}
		}
		return null;
	}
	
	public void showAllReceptionists()
	{
		for(int i=0; i<receptionists.length; i++)
		{
			if(receptionists[i] != null)
			{
				receptionists[i].showDetails();
			}
		}
	}
	
	public boolean insertStaff(Staff s)
	{
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == null)
			{
				staffs[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeStaff(Staff s)
	{
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == s)
			{
				staffs[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Staff searchStaff(int id)
	{
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getId()==id)
				{
					return staffs[i];
				}
			}
		}
		return null;
	}
	
	public void showAllStaffs()
	{
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				staffs[i].showDetails();
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("Name of Hospital : "+name);
		System.out.println("Address of Hospital : "+address);
		System.out.println("==========================");
		System.out.println("#######List of All Doctors#######");
		this.showAllDoctors();
		System.out.println("#######List of All Receptionists#######");
		this.showAllReceptionists();
		System.out.println("#######List of All Staffs#######");
		this.showAllStaffs();
		System.out.println();
	}
}