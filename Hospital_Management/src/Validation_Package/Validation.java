package Validation_Package;
import java.util.List;
import java.util.regex.Pattern;
import Enumm.Department;
import Exception_Package.InvalidEmail;
import Exception_Package.InvalidJoiningDate;
import Exception_Package.UserNotFound;
import Hospital_Package.Doctor;
import Exception_Package.DuplicateEmail;

public class Validation {
	
	public static void validateJoiningDate(String p)throws InvalidJoiningDate{
		
		boolean flag=false;
		Department[] arr=Department.values();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].toString().equals(p));
			flag=true;
			break;
		}
		if(flag==false) {
			System.out.println("You entered Invalid Joining Date");
		}
	}
	
	public static void validateEmail(String email) throws InvalidEmail{
		if(!(Pattern.matches("^[A-Z][a-z][0-9].*@gmail.com$", email)));
		throw new InvalidEmail("You Enter Invalid Email.....!");
	}
	
	public static void DuplicateEmail(String email,List<Doctor>doctors)throws DuplicateEmail,UserNotFound{
		if(doctors.contains(email)) {
			System.out.println("You entered Duplicate email You are not a Account Holder...!s");
		}
	}

}
