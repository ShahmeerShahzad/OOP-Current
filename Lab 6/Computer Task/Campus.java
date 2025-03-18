public class Campus {
	private String campusName;
	private Department[] departments;
	private String directorName;
	
	Campus(String campusName, Department[] departments, String directorName) {
		this.campusName = campusName;
		this.departments = departments;
		this.directorName = directorName;
	}

	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(campusName);
		st.append(directorName);
		st.append(departments);
		
		for (int i = 0; i < departments.length; i++) {
			st.append(departments[i]);
		}
		
		return st.toString();
	}

}