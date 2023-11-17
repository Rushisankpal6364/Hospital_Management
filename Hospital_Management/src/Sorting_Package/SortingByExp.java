package Sorting_Package;
import java.util.Comparator;
import Hospital_Package.Doctor;

public class SortingByExp implements Comparator<Doctor> {
	
	
@Override	
	public int compare(Doctor d1,Doctor d2) {
		if((d1.getJoining_Date().compareTo(d2.getJoining_Date()))==0) {
			if(d1.getExp()<d2.getExp()) {
				return -1;
			}
			else if(d1.getExp()>d2.getExp()){
				return 1;
			}
			else {
				return 0;
			}
		}
		return d1.getJoining_Date().compareTo(d2.getJoining_Date());
	}

}
