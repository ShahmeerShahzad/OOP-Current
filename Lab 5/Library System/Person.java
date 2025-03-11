public class Person {
	private String name;
	private String role;
	private Address address;
	
	Person(String name, String role, Address address) {
		this.name = name;
		this.role = role;
		this.address = address;
	}
	
	Person(Person other) {
		this.name = other.name;
		this.role = other.role;
		this.address = other.address;
	}
	
	public void showPersonDetails() {
		System.out.printf("Name: %s \n Role: %s \n", name, role);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}