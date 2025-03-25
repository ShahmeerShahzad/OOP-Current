public class Student extends Person {
	private String rollNumber;
	private ClassRoom classroom;

	Student(String name, int age, String rollNumber) {
		super(name, age);
		this.rollNumber = rollNumber;
	}
	
	public String getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Name: " + getName() + "\n");
		str.append("Age: " + getAge() + " years old \n");
		str.append("Roll Number: " + getRollNumber() + "\n\n");
		return str.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return this.rollNumber == other.rollNumber;
	}

	


}