package Hospital_Package;
import java.time.LocalDate;

import Enumm.Department;



//Class for defining variable

public class Doctor implements Comparable<Doctor>{
	  
      private int DocId;
      private String Dname;
      private String email;
      private LocalDate joining_Date;
      private double salary;
      private int exp;
      private Department dept;
      

      
      public Doctor(int DocId,String Dname,String email,LocalDate joining_Date,double salary,int exp,Department dept){
    	  
    	  this.DocId=DocId;                  //Parameterize Constructor
    	  this.Dname=Dname;
    	  this.email=email;
    	  this.joining_Date=joining_Date;
    	  this.salary=salary;
    	  this.exp=exp;
    	  this.dept=dept;
      }
      
      public Doctor(String email) {        //Parameterize Constructor for primary key
    	  this.email=email;
      }
      
     //Getters & Setters for all variables....

	public int getDocId() {
		return DocId;
	}

	public String getDname() {
		return Dname;
	}

	public Department getDept() {
		return dept;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getJoining_Date() {
		return joining_Date;
	}

	public double getSalary() {
		return salary;
	}

	public int getExp() {
		return exp;
	}
      
	//toString
	
	
	
	
	@Override
	public boolean equals(Object anotherobject) {
		System.out.println("in Doctor's eqn");
		if(anotherobject instanceof Doctor) 
		return this.email.equals(((Doctor)anotherobject).email);
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Doctor [DocId=" + DocId + ", Dname=" + Dname + ", email=" + email + ", joining_Date=" + joining_Date
				+ ", salary=" + salary + ", exp=" + exp + ", dept=" + dept + "]";
	}

	private Object Doctor(Object anotherobject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Doctor anotherDoctor) {
		System.out.println("Compares to");
		return this.email.compareTo(anotherDoctor.email);
	}

	
}
