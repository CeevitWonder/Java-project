import java.lang.*;
import classes.*;
import java.util.Scanner;
import fileio.FileReadWriteDemo;

public class Start
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		String n, bn;
		System.out.println();
		System.out.print("Enter Hospital Name: ");
		n = sc.nextLine();
		System.out.print("Enter Address Name: ");
		bn = sc.nextLine();
		Hospital h = new Hospital(n, bn);
		Doctor d = new Doctor();
		
		System.out.println("\t\t*********************************************************");
		System.out.println("\t\t*********   Welcome to "+"'"+h.getName()+"'"+" Application  ***********");
		System.out.println("\t\t*********************************************************");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println();
			System.out.println("\t\t\t\tWhat Do You Want To Do?\n");
			System.out.println("\t\t\t1. Doctor Management");
			System.out.println("\t\t\t2. Staff Management");
			System.out.println("\t\t\t3. Receptionist Management");
            System.out.println("\t\t\t4. Patient Management");
			System.out.println("\t\t\t5. Patient Transactions");
			System.out.println("\t\t\t6. Show Hospital Information");
			System.out.println("\t\t\t7. Exit");
				
			System.out.println("\n---------------------------");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			System.out.println("---------------------------\n");
			
			
			switch(choice)
			{
				case 1:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Doctor Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat1 = true;
					
					while(repeat1)
					{
					
						System.out.println("\tDoctor Management Options are: \n");
						System.out.println("\t\t1. Insert New Doctor");
						System.out.println("\t\t2. Remove Doctor");
						System.out.println("\t\t3. Search Doctor");
						System.out.println("\t\t4. Show All Doctors");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option1 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option1)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Doctor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Doctor ID: ");
								int id1 = sc.nextInt();
								System.out.print("Enter Doctor Name: ");
								String name1 = sc.next();
								System.out.print("Enter Doctor's Time: ");
								String timing1 = sc.next();
								System.out.print("Enter Doctor's Category: ");
								String category1 = sc.next();
								System.out.print("Enter Doctor's Qualification: ");
								String qualification1 = sc.next();
								System.out.print("Enter Doctor's Room: ");
								String rm1 = sc.next();
								
								Doctor d1 = new Doctor();
								d1.setId(id1);
								d1.setName(name1);
								d1.setTiming(timing1);
								d1.setCategory(category1);
								d1.setQualification(qualification1);
								d1.setRoom(rm1);
								
								if(h.insertDoctor(d1))
								{
									System.out.println(id1 + " Doctor Has Been Inserted");
								}
								else
								{
									System.out.println(id1 + " Doctor Can NOT be Inserted");
								}
								
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Doctor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to remove a Doctor: ");
								int id2 = sc.nextInt();
								
								Doctor d2 = h.searchDoctor(id2);
								
								if(d2 != null)
								{
									if(h.removeDoctor(d2))
									{
										System.out.println(id2+" *** Doctor Removed *** ");
									}
								}
								else
								{
									System.out.println(id2+" *** Doctor Can NOT be Removed *** ");
								}
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Doctor");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to search a Doctor: ");
								int id3 = sc.nextInt();
								
								Doctor d3 = h.searchDoctor(id3);
								
								if(d3 != null)
								{
									System.out.println(id3+" *** Doctor Found *** ");
									d3.showDetails();
								}
								else
								{
									System.out.println(id3+" *** Doctor NOT Found *** ");
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Doctors");
								System.out.println("************************************");
								System.out.println();
								h.showAllDoctors();
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat1 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 2:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Staff Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat2 = true;
					
					while(repeat2)
					{
					
						System.out.println("\tStaff Management Options are: \n");
						System.out.println("\t\t1. Insert New Staff");
						System.out.println("\t\t2. Remove Staff");
						System.out.println("\t\t3. Search Staff");
						System.out.println("\t\t4. Show All Staff");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option2 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option2)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Staff");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.println("Which Type of Staff do you want to insert?");
								System.out.println("\t\t 1. Nurse");
								System.out.println("\t\t 2. Wardboy");
								System.out.println("\t\t 3. Go Back");
									
								System.out.println("\n---------------------------");
								System.out.print("Enter Your Type: ");
								int type = sc.nextInt();
								System.out.println("---------------------------\n");
									
								Staff s = null;
									
								if(type == 1)
								{
									System.out.println("***************");
									System.out.println("Nurse");
									System.out.println("***************");
									System.out.println();
										
									System.out.print("Enter Nurse ID: ");
								    int id1 = sc.nextInt();
								    System.out.print("Enter Nurse Name: ");
								    String name1 = sc.next();
									System.out.print("Enter Nurse's Salary: ");
								    double salary1 = sc.nextDouble();
								    System.out.print("Enter Nurse's Gender: ");
								    String gender1 = sc.next();
								    System.out.print("Enter Nurse's Timing: ");
								    String timing1 = sc.next();
										
									Nurse n1 = new Nurse(id1,name1,salary1,gender1,timing1);
										
									s = n1;
										
								}
								else if(type == 2)
								{
									System.out.println("***************");
									System.out.println("Wardboy");
									System.out.println("***************");
									System.out.println();
										
									System.out.print("Enter Wardboy ID: ");
								    int id2 = sc.nextInt();
								    System.out.print("Enter Wardboy Name: ");
								    String name2 = sc.next();
									System.out.print("Enter Wardboy Salary: ");
								    double salary2 = sc.nextDouble();
								    System.out.print("Enter Wardboy's Gender: ");
								    String gender2 = sc.next();
								    System.out.print("Enter Wardboy's Timing: ");
								    String timing2 = sc.next();
										
									Wardboy w1 = new Wardboy(id2,name2,salary2,gender2,timing2);
										
									s = w1;
										
								}
								else if(type == 3)
								{
										System.out.println("***************");
										System.out.println("Going Back");
										System.out.println("***************");
										System.out.println();
								}
								else
								{
										System.out.println("***************");
										System.out.println("Invalid Type");
										System.out.println("***************");
										System.out.println();
								}
									
								if(s != null)
								{
									if(h.insertStaff(s))
									{
											System.out.println("*** Staff Inserted ***");
									}
									else
									{
											System.out.println("*** Staff NOT Inserted ***");
									}
								}
									
						        
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Staff");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to remove a Staff: ");
								int id2 = sc.nextInt();
								
								Staff s2 = h.searchStaff(id2);
								
								if(s2 != null)
								{
									if(h.removeStaff(s2))
									{
										System.out.println("*** Staff Removed ***");
									}
								}
								else
								{
									System.out.println("*** Staff Can NOT be Removed ***");
								}
								
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Staff");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to search a Staff: ");
								int id3 = sc.nextInt();
								
								Staff s3 = h.searchStaff(id3);
								
								if(s3 != null)
								{
									System.out.println("*** Staff Found ***");
									s3.showDetails();
								}
								else
								{
									System.out.println("*** Staff NOT Found ***");
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Staff");
								System.out.println("************************************");
								System.out.println();
								h.showAllStaffs();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat2 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
				
				case 3:
					
					System.out.println("#####################################");
					System.out.println("You Have Selected Receptionist Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat3 = true;
					
					while(repeat3)
					{
					
						System.out.println("\tReceptionist Management Options are: \n");
						System.out.println("\t\t1. Insert New Receptionist");
						System.out.println("\t\t2. Remove Receptionist");
						System.out.println("\t\t3. Search Receptionist");
						System.out.println("\t\t4. Show All Receptionist");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option3 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option3)
						{
							case 1:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Insert Receptionist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter Receptionist ID: ");
								int id1 = sc.nextInt();
								System.out.print("Enter Receptionist Name: ");
								String name1 = sc.next();
								System.out.print("Enter Receptionist's Blood Group: ");
								String bloodgr1 = sc.next();
								System.out.print("Enter Receptionist's Address: ");
								String address1 = sc.next();
								System.out.print("Enter Receptionist's Phone Number: ");
								String phnNumber1 = sc.next();
								
								Receptionist r1 = new Receptionist();
								r1.setId(id1);
								r1.setName(name1);
								r1.setBloodgr(bloodgr1);
								r1.setAddress(address1);
								r1.setPhnNumber(phnNumber1);
								
								if(h.insertReceptionist(r1))
								{
									System.out.println(id1 + " Receptionist Has Been Inserted");
								}
								else
								{
									System.out.println(id1 + " Receptionist Can NOT be Inserted");
								}
								
								break;
								
							case 2:
								
								System.out.println("*********************************");
								System.out.println("You Have Selected Remove Receptionist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to remove a Receptionist: ");
								int id2 = sc.nextInt();
								
								Receptionist r2 = h.searchReceptionist(id2);
								
								if(r2 != null)
								{
									if(h.removeReceptionist(r2))
									{
										System.out.println(id2+" *** Receptionist Removed *** ");
									}
								}
								else
								{
									System.out.println(id2+" *** Receptionist Can NOT be Removed *** ");
								}
								
								break;
								
							case 3:
							
								System.out.println("*********************************");
								System.out.println("You Have Selected Search Receptionist");
								System.out.println("*********************************");
								System.out.println();
								
								System.out.print("Enter The ID to search a Receptionist: ");
								int id3 = sc.nextInt();
								
								Receptionist r3 = h.searchReceptionist(id3);
								
								if(r3 != null)
								{
									System.out.println("*** Receptionist Found ***");
									r3.showDetails();
								}
								else
								{
									System.out.println("*** Receptionist NOT Found ***");
								}
								
								break;
								
							case 4:
								
								System.out.println("************************************");
								System.out.println("You Have Selected Show All Receptionist");
								System.out.println("************************************");
								System.out.println();
								h.showAllReceptionists();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat3 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
					
				case 4:
				
					System.out.println("#####################################");
					System.out.println("You Have Selected Patient Management");
					System.out.println("#####################################");
					System.out.println();
					
					boolean repeat4 = true;
					
					while(repeat4)
					{
					
						System.out.println("\tPatient Management Options are: \n");
						System.out.println("\t\t1. Insert New Patient");
						System.out.println("\t\t2. Remove Patient");
						System.out.println("\t\t3. Search Patient");
						System.out.println("\t\t4. Show All Patients");
						System.out.println("\t\t5. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option4 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option4)
						{
							case 1:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Insert Patient");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Patient ID: ");
								int id1 = sc.nextInt();
								System.out.print("Enter Patient Name: ");
								String name1 = sc.next();
								System.out.print("Enter Patient's Age: ");
								int age1 = sc.nextInt();
								System.out.print("Enter Patient's Disease: ");
								String disease1 = sc.next();
								System.out.print("Enter Patient's Balance: ");
								double balance1 = sc.nextDouble();
								
								Patient p1 = new Patient();
								p1.setId(id1);
								p1.setName(name1);
								p1.setAge(age1);
								p1.setDisease(disease1);
								p1.setBalance(balance1);
								
								if(d.insertPatient(p1))
								{
									System.out.println(id1 + " Patient Has Been Inserted");
								}
								else
								{
									System.out.println(id1 + " Patient Can NOT be Inserted");
								}
							
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Remove Patient");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter The ID to remove a Patient: ");
								int id2 = sc.nextInt();
								
								Patient p2 = d.searchPatient(id2);
								
								if(p2 != null)
								{
									if(d.removePatient(p2))
									{
										System.out.println(id2+" *** Patient Removed *** ");
									}
								}
								else
								{
									System.out.println(id2+" *** Patient Can NOT be Removed *** ");
								}
								
								
								break;
								
							case 3:
							
								System.out.println("********************************");
								System.out.println("You Have Selected Search Patient");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter The ID to search a Patient: ");
								int id3 = sc.nextInt();
								
								Patient p3 = d.searchPatient(id3);
								
								if(p3 != null)
								{
									System.out.println("*** Patient Found ***");
									p3.showDetails();
								}
								else
								{
									System.out.println("*** Patient NOT Found ***");
								}
								
								
								break;
								
							case 4:
								
								System.out.println("***********************************");
								System.out.println("You Have Selected Show All Patient");
								System.out.println("***********************************");
								System.out.println();
								d.showDetails2();
								
								break;
								
							case 5:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								repeat4 = false;
								System.out.println();
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
				
					break;
					
				case 5:
					
					System.out.println("######################################");
					System.out.println("You Have Selected Patient Transactions");
					System.out.println("######################################");
					System.out.println();
					
					boolean repeat5 = true;
					
					while(repeat5)
					{
					
						System.out.println("\tPatient Transaction Options are: \n");
						System.out.println("\t\t1. Add Money");
						System.out.println("\t\t2. Cost Money");
						System.out.println("\t\t3. Transaction History");
						System.out.println("\t\t4. Go Back");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter Your Option: ");
						int option5 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option5)
						{
							case 1:
						
                                System.out.println("********************************");
								System.out.println("You Have Selected Add Money");
								System.out.println("********************************");
								System.out.println();
								
								System.out.println("Enter Patient's ID Number: ");
								int an2 = sc.nextInt();
								
								Patient p2 = d.searchPatient(an2);
								
								if(p2 != null)
								{
									System.out.println("*** Valid Patient ***");
									System.out.println("Current Balance	: " + p2.getBalance());
									System.out.print("Add to Balance : ");
									double am = sc.nextDouble();
									if(p2.addmoney(am))
									{
										System.out.println("---  Successfull ---");
										System.out.println("New Balance : " + p2.getBalance());
										frwd.writeInFile(am + " BDT added in ID " + p2.getId());
									}
									else
									{
										System.out.println("--- Failed ---");
									}
								}
								else{
									System.out.println("Invalid");
								}
								
								break;
								
							case 2:
								
								System.out.println("********************************");
								System.out.println("You Have Selected Cost Money");
								System.out.println("********************************");
								System.out.println();
								
								System.out.print("Enter Patient's ID Number: ");
								int an1 = sc.nextInt();
								
								Patient p1 = d.searchPatient(an1);
								
								if(p1 != null)
								{
									System.out.println("*** Valid Patient ***");
									System.out.println("Current Balance	: " + p1.getBalance());
									System.out.print("Cost Amount	: ");
									double am = sc.nextDouble();
									if(p1.costmoney(am))
									{
										System.out.println("---  Successfull ---");
										System.out.println("New Balance	: " + p1.getBalance());
										frwd.writeInFile(am + "BDT cost in ID " + p1.getId());
									}
									else
									{
										System.out.println("--- Failed ---");
									}
								}
								else{
									System.out.println("Invalid");
								}
								
								break;
								
							case 3:	

								System.out.println("*************************************");
								System.out.println("You Have Selected Transaction History");
								System.out.println("*************************************");
								System.out.println();
								frwd.readFromFile();
								
								break;
								
							case 4:
								
								System.out.println("*********************");
								System.out.println("Going Back...........");
								System.out.println("*********************");
								System.out.println();
								repeat5 = false;
								break;
								
							default:
								
								System.out.println("*********************");
								System.out.println("Invalid Option.......");
								System.out.println("*********************");
								System.out.println();
								
								break;
						}
					}
					
					break;
					
				case 6:
					
					System.out.println("##################################");
					System.out.println("You Have Selected Hospital Information");
					System.out.println("##################################");
					System.out.println();
					h.showDetails();
					
					break;
					
				case 7:
					
					System.out.println("###################################");
					System.out.println("Thank You for Using Our Application");
					System.out.println("###################################");
					System.out.println();
					
					repeat = false;
					
					break;
					
				default:
				
					System.out.println("######################");
					System.out.println("Invalid Selection.....");
					System.out.println("######################");
					System.out.println();
					
					break;
			}
		}
	}
}