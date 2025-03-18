public class Department {
	private Employee hod = new Employee("James", "HOD");
	private String departmentName;
	private Lab[] labs;
	private Employee labInCharge = new Employee("Samson", "Lab Head");
	
	Department(Employee hod, String departmentName, Lab[] labs, Employee labInCharge) { 
		this.hod = hod;
		this.departmentName = departmentName;
		this.labs = labs;
		this.labInCharge = labInCharge;
	}
	
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(departmentName);
		st.append(hod);
		st.append(labs);
		
		for (int i = 0; i < labs.length; i++) {
			st.append(labs[i]);
		}
		
		st.append(labInCharge);
		
		return st.toString();
	}

}