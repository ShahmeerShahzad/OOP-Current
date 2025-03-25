public class Principal extends Person {
	private int experience;
	
	Principal(String name, int age, int experience) {
		super(name, age);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Principal: \n");
		str.append("Name: " + getName() + "\n");
		str.append("Age: " + getAge() + " years old \n");
		str.append("Experience: " + getExperience() + " years \n\n");
		return str.toString();
	}

}