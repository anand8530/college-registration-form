package Project;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Execute {
	public static void main(String[] args) {
	 int Srno;
	 String Firstname;
	 String Lastname;
	 String city;
	 String Emailid;
	 String Contactno;
	 double percentageoflastyear;
	 String Stream;
	 int Age;
		
		Scanner sc=new Scanner(System.in);
		StudentInfodao obj=new StudentInfodao();
		StudentInfo std=new StudentInfo();
		int choice;
		do {
			System.out.println("Enter 1 for Insert Your Information");
			System.out.println("Enter 2 for Update Your data");
			System.out.println("Enter 3 for Delete Your Information");
			System.out.println("Enter 4 for Show All Data");
			System.out.println("Enter 0 for Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			{
				System.out.println("-----------------------Hello Student Please Your  Correct Details--------------------------");
				System.out.println("Please Enter Your FirstName");
				Firstname=sc.next();
				System.out.println("Please Enter Your Lastname");
				Lastname=sc.next();
				System.out.println("Enter your City");
				city=sc.next();
				System.out.println("Enter Your Contactno");
				Contactno=sc.next();
				System.out.println("Enter your percentageoflastyear");
				percentageoflastyear=sc.nextDouble();
				System.out.println("Enter your Stream which you want to applied for Addmission");
				Stream=sc.next();
				System.out.println("Enter Your Age ");
				Age=sc.nextInt();
				System.out.println("Enter your Email Id");
				Emailid=sc.next();
				std.setFirstname(Firstname);
				std.setLastname(Lastname);
				std.setCity(city);
				std.setContactno(Contactno);
				std.setPercentageoflastyear(percentageoflastyear);;
				std.setStream(Stream);
				std.setAge(Age);
				std.setEmailid(Emailid);
				boolean responce=obj.insert(std);
				if(responce==true) {
					System.out.println("Data inserted sucessfully");
				}else {
					System.out.println("error");
				}
				break;
			}
			
			
			case 2:
			{
				System.out.println("-----------Please enter proper Information------------------------");
				System.out.println("Enter Your Serial No ");
				Srno=sc.nextInt();
				System.out.println("enter  your Firstname");
				Firstname=sc.next();
				System.out.println("Please Enter Your Lastname");
				Lastname=sc.next();
				System.out.println("enter city");
				city=sc.next();
				System.out.println("Enter Your Contactno");
				Contactno=sc.next();
				System.out.println("Enter your percentageoflastyear");
				percentageoflastyear=sc.nextDouble();
				System.out.println("Enter your Stream which you want to applied for Addmission");
				Stream=sc.next();
				System.out.println("Enter Your Age ");
				Age=sc.nextInt();
				System.out.println("Enter your Email Id");
				Emailid=sc.next();
				std.setFirstname(Firstname);
				std.setLastname(Lastname);
				std.setCity(city);
				std.setContactno(Contactno);
				std.setPercentageoflastyear(percentageoflastyear);
				std.setStream(Stream);
				std.setAge(Age);
				std.setEmailid(Emailid);
				std.setSrno(Srno);

				boolean responce1=obj.update(std);
				if(responce1==true) {
					System.out.println("Data  updated sucessfully");
					System.out.println("==================");
					System.out.println();
				}else {
					System.out.println("Error Please Enter Proper data");
				}
				break;
			}
			
			
			case 3:
			{
				
				System.out.println("------------Delete your Data---------------------");
				System.out.println("Enter Your Serial no ");
				Srno=sc.nextInt();
				std.setSrno(Srno);
				boolean responce2=obj.delete(std);
				if(responce2==true) {
					System.out.println("Data Delete sucessfully");
				}else {
					System.out.println("error! plz enter correct id");
				}
				break;
				
				
				
			}
			
			
			case 4:{
				List <StudentInfo> data=obj.select();
				Iterator it=data.iterator();
				System.out.println("All the Students data is Show Down");
				
				while(it.hasNext()) {
					System.out.println(it.next());
					
				}
				
			}
				default:{
					System.out.println("--------please enter valid choice------");
					}
			
				
			
			}	
			
		}while(choice!=0);
		

	}
}

