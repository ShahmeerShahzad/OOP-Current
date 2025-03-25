public class Teacher extends Person {
	private String subject;
	private ClassRoom classroom;
	private int teacherId;

	Teacher(String name, int age, String subject, int teacherId) {
		super(name, age);
		this.subject = subject;
		this.teacherId = teacherId;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getTeacherId() {
		return teacherId;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Teacher : \n");
		str.append("Name: " + getName() + "\n");
		str.append("Age: " + getAge() + " years old \n");
		str.append("Teacher ID: " + teacherId + "\n");
		str.append("Subject: " + subject + "\n\n");
		return str.toString();
	}

	@Override
	public boolean equals(Object obj) {
		Teacher other = (Teacher) obj;
		return this.teacherId == other.teacherId;
	}
	

}