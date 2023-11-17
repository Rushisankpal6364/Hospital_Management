package Enumm;

public enum Department {
	ORTHO(1000), PEDIATRICS(3000), PHYSIIOTHEROPY(5000), GASTROLOGY(10000),NONE(0);
	
	//private String Department;
	private double fees;
	
//	
//	Department(String Department){
//		this.Department=Department;
//	}

	Department(double fees){
		this.fees=fees;
	}

//	public String getDepartment() {
//		return Department;
//	}

	public double getFees() {
		return fees;
	}
	
	
}
