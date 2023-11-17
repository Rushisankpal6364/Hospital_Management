package Tester;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Enumm.Department;
import Exception_Package.InvalidEmail;
import Exception_Package.InvalidJoiningDate;
import Exception_Package.InvaliddocId;
import Hospital_Package.Doctor;
import Sorting_Package.SortingByExp;



public class Tester {
	
	public static void main(String[] args)throws InvalidEmail,InvaliddocId,InvalidJoiningDate{
		 
	      int DocId;
	      String Dname;
	      String email;
	      LocalDate joining_Date;
	      double salary;
	      int exp;
	      
	      ArrayList<Doctor>doctors=new ArrayList<>();
	      //ORTHO(1000), PEDIATRICS(3000), PHYSIIOTHEROPY(5000), GASTROLOGY(10000),NONE(0);
	      doctors.add(new Doctor(101,"Rushikesh","rushi@gmail.com",LocalDate.parse("2021-01-01"),5000,10, Department.PHYSIIOTHEROPY));
	      doctors.add(new Doctor(102,"Shubham","shubh@gmail.com",LocalDate.parse("2021-03-01"),3000,4, Department.ORTHO));
	      doctors.add(new Doctor(103,"Rajat","rajjo@gmail.com",LocalDate.parse("2022-10-25"),10000,7,Department.GASTROLOGY));
	      doctors.add(new Doctor(104,"Gaurav","gau@gmail.com",LocalDate.parse("2020-06-01"),1000,11, Department.ORTHO));
	      doctors.add(new Doctor(105,"Shadab","shadaa@gmail.com",LocalDate.parse("2011-05-20"),3000,22, Department.PEDIATRICS));
	      doctors.add(new Doctor(106,"Vaishnav","vaish@gmail.com",LocalDate.parse("2015-07-14"),1000,18, Department.ORTHO));
	      doctors.add(new Doctor(107,"Nikhil","nik@gmail.com",LocalDate.parse("2023-01-01"),5000,3, Department.PHYSIIOTHEROPY));
	      doctors.add(new Doctor(108,"Ishan","ishan@gmail.com",LocalDate.parse("2022-04-01"),1000,5, Department.ORTHO));
	      doctors.add(new Doctor(109,"Avik","gogai@gmail.com",LocalDate.parse("2017-05-23"),10000,10, Department.GASTROLOGY));
	      doctors.add(new Doctor(110,"Isha","isha@gmail.com",LocalDate.parse("2019-09-09"),5000,10,Department.PHYSIIOTHEROPY));
	      doctors.add(new Doctor(111,"Rajan","rajan@gmail.com",LocalDate.parse("2015-12-12"),3000,13, Department.PEDIATRICS));
    
	      int n = 0;
	      Doctor d;
	      
	      Scanner sc=new Scanner(System.in);
	      
	      do {
	    	  System.out.println("1. SignIn");
	    	  System.out.println("2. Add new doctor record in collection");
	    	  System.out.println("3. Display the Name of Doctors who Have Highest Salary");
	    	  System.out.println("4. Sort All the doctors basis on experience");
	    	  System.out.println("5. Search all the doctors who are Orthopedics");
	    	  System.out.println("6. Display All Doctors : ");
	    	  System.out.println("7. Display email Address of All Doctors : ");
	    	  System.out.println("8. Exit");
	    	  n=sc.nextInt();
	     try {
	     	switch(n){
	    		
	     	case 1:
	     		
	     	//	SignIn
	    	
	    	      System.out.println("Enter Dname : ");
	    	      Dname=sc.next();
	    	      System.out.println("Enter email : ");
	    	      email=sc.next();
	    	      System.out.println("Enter joining Date : ");
	    	      joining_Date=LocalDate.parse(sc.next());
	    	      System.out.println("Enter Salary : ");
	    	      salary=sc.nextDouble();
	    	      System.out.println("Enter experience :  ");
	    	      exp=sc.nextInt();
	    	      System.out.println("SignIn Successfull...!");
	    	      break;
	    	  
	     	case 2:
	     		//int DocId,String Dname,String email,LocalDate joining_Date,double salary,int exp
	     		System.out.println("DocId,Dname,email,joining_Date,Salary,exp,Specialisation");
	     		doctors.add(new Doctor(sc.nextInt(),sc.next(),sc.next(),LocalDate.parse(sc.next()),sc.nextDouble(),sc.nextInt(),Department.valueOf(sc.next())));
	     		break;
	     		
	     	
	     	case 3:
	     		
//	     		double maxSal=0;
//	     		Doctor d1=null;
//	     		for(Doctor d2:doctors)
//	     		{
//	     			if(d2.getSalary()>maxSal) {
//	     				maxSal=d2.getSalary();
//	     				d1=d2;
//	     			}
//	     		}
//	     		System.out.println(d1);
//	     		break;
//	     		
	     		double maxSal=0;
	     		Doctor d1=null;
	     		for(Doctor d2:doctors) {
	     			if(d2.getSalary()>maxSal) {
	     				maxSal=d2.getSalary();
	     				d1=d2;
	     			}
	     		}
	     		System.out.println(d1);
	     		break;
	     		
	     		
	     		
	     	case 4:
	     		
	     		Collections.sort(doctors,new SortingByExp());
//	     		for(Doctor d3:doctors) {
//	     			System.out.println(d3);
//	     		}
	     		break;
	     			
	     		
	     		
	     	case 5:
	     		doctors.stream().filter(p->p.getDept().name().equals("ORTHO")).forEach(System.out::println);
	     		break;
	     		
	     		
	     	case 6:
	     		
	     		//Display All Doctors
	     		
	     		  if(doctors.isEmpty()) {
	     			  System.out.println("User Not Found...!");
	     			  break;
	     		  }
	     		  for(Doctor d11:doctors) {
	     			  System.out.println(d11);
	     		  }
	     		  break;
	     		  
	     		  
	     	case  7:
	     		
	     		//Display email Address of All Doctors
	     		
	     		for(Doctor e:doctors) {
	     			System.out.println(e.getDname()+"------->"+e.getEmail());
	     		}
	     		break;
	     		
	     		
	    	  
	     	case 8:
	     		System.out.println("You Choose Exit....!");
	     		break;
	     		
	    	
	    	}
	    }catch (Exception e) {
	    	System.out.println(e);
	    }  	  
	    	  
	    	  
	      }while (n!=8);
	          
	}

}
