package classes;

import java.lang.*;

public class Wardboy extends Staff
{
	private String gender;
	private String timing;
	
	public Wardboy(){};
	public Wardboy(int id,String name,double salary,String gender,String timing)
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
		System.out.println("ID of Wardboy      : "+this.getId());
		System.out.println("Name of Wardboy    : "+this.getName());
		System.out.println("Salary of Wardboy  : "+this.getSalary());
		System.out.println("Gender of Wardboy  : "+gender);
		System.out.println("Timing of Wardboy  : "+timing);
		System.out.println("--------------------------------------------");
	}
}