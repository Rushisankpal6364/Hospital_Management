package DocRepo_Package;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Exception_Package.UserNotFound;
import Hospital_Package.Doctor;
import Exception_Package.InvaliddocId;

public class DocRepo {
      
	public static Doctor findbyemail(String email,List<Doctor>Doctors)throws UserNotFound{
		
		Doctor d=new Doctor(email);
		int i=Doctors.indexOf(d);
		if(i==-1) {
			throw new UserNotFound("User Not Found......!");
		}
		
		return Doctors.get(i);
		
	}
	
	public static Doctor InvaliddocId(String email,LocalDate joining_Date, ArrayList<Doctor>doctors)throws InvaliddocId{
		
		boolean flag=false;
		Doctor d=null;
		for(Doctor d1:doctors) {
			if(d1.getEmail().equals(email)&& d1.getJoining_Date().equals(joining_Date)) {
				flag=true;
				d=d1;
				break;
			}
			if(!flag) {
				throw new InvaliddocId("You ENtered Invalid Doctor id");
			}
		}
		
		return d;
		
	}
}
