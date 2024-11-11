package classes;

import java.lang.*;

public class Receptionist
{
	private int id;
	private String name;
	private String bloodgr;
	private String address;
	private String phnNumber;
	
	public Receptionist(){};
	public Receptionist(int id,String name,String bloodgr,String address,String phnNumber)
	{
		this.id = id;
		this.name = name;
		this.bloodgr = bloodgr;
		this.address = address;
		this.phnNumber = phnNumber;
	}
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setBloodgr(String bloodgr){this.bloodgr = bloodgr;}
	public void setAddress(String address){this.address = address;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public String getBloodgr(){return bloodgr;}
	public String getAddress(){return address;}
	public String getPhnNumber(){return phnNumber;}
	
	public void showDetails()
	{
		System.out.println("ID of Receptionist : "+id);
		System.out.println("Name of Receptionist : "+name);
		System.out.println("Category of Receptionist : "+bloodgr);
		System.out.println("Address of Receptionist : "+address);
		System.out.println("Phone Number of Receptionist : "+phnNumber);
	}	
}