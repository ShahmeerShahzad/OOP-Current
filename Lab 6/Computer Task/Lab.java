public class Lab {
	private String labName;
	private Employee[] labStaff;
	private SystemUnit[] system;
	private boolean hasMultimedia;

	public Lab(String labName, Employee[] labStaff, SystemUnit[] system, boolean hasMultimedia) {
		this.labName = labName;
		this.labStaff = labStaff;
		this.system = system;
		this.hasMultimedia = hasMultimedia;
	}

	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append(labName);
		st.append(labStaff);

		for (int i = 0; i < labStaff.length; i++) {
			st.append(labStaff[i]);
		}
		
		st.append(system);
		
		for (int i = 0; i < system.length; i++) {
			st.append(system[i]);
		}

		return st.toString();
	}
}