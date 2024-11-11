package classes;

import java.lang.*;
import interfaces.PatientTransactions;

public class Patient implements PatientTransactions
{
	private int id;
	private String name;
	private int age;
	private String disease;
	private double balance;
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setDisease(String disease){this.disease = disease;}
	public void setBalance(double balance){this.balance = balance;}
	
	public int getId(){return id;}
	public String getName(){return name;}
	public int getAge(){return age;}
	public String getDisease(){return disease;}
	public double getBalance(){return balance;}
	
	public boolean addmoney(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			return true;
		}
		return false;
	}
	
	public boolean costmoney(double amount)
	{
		if(amount>0 && amount<= balance)
		{
			balance = balance - amount;
			return true;
		}
		return false;
	}
	
	public void showDetails()
	{
		System.out.println("ID of Patient : "+id);
		System.out.println("Name of Patient : "+name);
		System.out.println("Age of Patient : "+age);
		System.out.println("Disease of Patient : "+disease);
		System.out.println("Balance of Patient : "+balance);
		System.out.println("--------------------------------------------");
	}
}




