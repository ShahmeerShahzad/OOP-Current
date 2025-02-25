public class StudentInfo {

	private String regNum;
	private String name;
	private String city;
	private String address;
	private double gpa;
	private static int counter = 0;



	public StudentInfo(String city, String name, String address, double gpa) {
		this.city = city;
		this.name = name;
		this.regNum = String.format("FA24-BCS-%03d", ++counter);
		this.address = address;
		this.gpa = gpa;
	}

	public void setCity(String city) {
		this.city = city;
	} 

	String getCity() {
		return city;
	}

	public void setName(String name) {
		this.name = name;
	} 

	String getName() {
		return name;
	}

	public void setRegNum(int regNum) {
		this.regNum = String.format("FA24-BCS-%03d", regNum);
	} 
	
	String getRegNum() {
		return regNum;
	}

	void setAddress(String address) {
		this.address = address;
	} 
	
	String getAddress() {
		return address;
	}

	void setGPA(double gpa) {
		this.gpa = gpa;
	} 

	double getGPA() {
		return gpa;
	}

	public void Display() {
	System.out.printf("Name: %s \n", name);
	System.out.printf("Reg. Num.: %s \n", regNum);
	System.out.printf("City: %s \n", city);
	System.out.printf("Address: %s \n", address);
	System.out.printf("GPA: %.2f \n \n", gpa);
	}
}