package classes;

import java.lang.*;

public class Nurse extends Staff
{
	private String gender;
	private String timing;
	
	public Nurse(){};
	public Nurse(int id,String name,double salary,String gender,String timing)
	{
		super(id,name,salary);
		this.gender  = gender;
		this.timing = timing;
	}
	
	public void setGender(){this.gender = gender;}
	public void setTiming(){this.timing = timing;}
	public String getGender(){return gender;}
	public String getTiming(){return timing;}

	public void showDetails()
	{
		System.out.println("ID of Nurse     : "+this.getId());
		System.out.println("Name of Nurse   : "+this.getName());
		System.out.println("Salary of Nurse : "+this.getSalary());
		System.out.println("Gender of Nurse : "+gender);
		System.out.println("Timing of Nurse : "+timing);
		System.out.println("--------------------------------------------");
	}
}