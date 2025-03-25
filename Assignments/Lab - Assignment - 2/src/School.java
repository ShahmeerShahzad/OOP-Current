public class School {
	private String name;
	private String address;
	private ClassRoom[] classes =  new ClassRoom[2];
	private int classroomCount;
	private Principal principal;
	
	School(String name, String address, Principal principal) {
		this.name = name;
		this.address = address;
		this.principal = principal;
		this.classroomCount = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String Address) {
		this.address = address;
	}
	
	public void addClassroom(ClassRoom classroom) {
		classes[classroomCount++] = classroom;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("School : \n");
		str.append("School Name: " + name + "\n");
		str.append("Address: " + address + "\n");
		str.append(principal.toString());
		str.append("Classrooms: \n");
		for (int i = 0; i < classes.length; i++) {
			str.append(classes[i].toString());
		}
		return str.toString();
	}


}