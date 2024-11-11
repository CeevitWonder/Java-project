package classes;

import java.lang.*;
import interfaces.PatientOperations;

public class Doctor implements PatientOperations
{
	private int id;
	private String name;
	private String timing;
	private String category;
	private String qualification;
	private String rm;
	Patient patients[] = new Patient[500];
	
	public Doctor(){};
	public Doctor(int id,String name,String timing,String category,String qualification,String rm)
	{
		this.id = id;
		this.name = name;
		this.timing = timing;
		this.category = category;
		this.qualification = qualification;
		this.rm = rm;
	}
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setTiming(String timing){this.timing = timing;}
	public void setCategory(String category){this.category = category;}
	public void setQualification(String qualification){this.qualification = qualification;}
	public void setRoom(String rm){this.rm = rm;}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public String getTiming(){return timing;}
	public String getCategory(){return category;}
	public String getQualification(){return qualification;}
	public String getRoom(){return rm;}
	
	public boolean insertPatient(Patient p)
	{
		for(int i=0; i<patients.length; i++)
		{
			if(patients[i] == null)
			{
				patients[i] = p;
				return true;
			}
		}
		return false;
	}
	
	public boolean removePatient(Patient p)
	{
		for(int i=0; i<patients.length; i++)
		{
			if(patients[i] == p)
			{
				patients[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Patient searchPatient(int id)
	{
		for(int i=0; i<patients.length; i++)
		{
			if(patients[i] != null)
			{
				if(patients[i].getId()==id)
				{
					return patients[i];
				}
			}
		}
		return null;
	}
	
	public void showAllPatients()
	{
		for(int i=0; i<patients.length; i++)
		{
			if(patients[i] != null)
			{
				patients[i].showDetails();
			}
		}
	}

	public void showDetails()
	{
		System.out.println("ID of Doctor            : "+id);
		System.out.println("Name of Doctor          : "+name);
		System.out.println("Timing of Doctor        : "+timing);
		System.out.println("Category of Doctor      : "+category);
		System.out.println("Qualification of Doctor : "+qualification);
		System.out.println("Room of Doctor          : "+rm);
		System.out.println("--------------------------------------------");
	}
	
	public void showDetails2()
	{
		this.showAllPatients();
	}
}