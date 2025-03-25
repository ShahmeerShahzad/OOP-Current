public class Main {
	public static void main(String args[]) {
		Principal principal = new Principal("James Smith", 57, 23);
		
		School school = new School("Chouiefat International School of Sharjah", "Sharjah", principal);
		
		Teacher teacher1 = new Teacher("Sarah Williams", 31, "Mathematics", 225);
		
		Teacher teacher2 = new Teacher("John Doe", 46, "Computer Science", 678);
		
		ClassRoom class1 = new ClassRoom("Grade 11", "G11", teacher1); 
		
		ClassRoom class2 = new ClassRoom("Grade 12", "G12", teacher2);

		school.addClassroom(class1);
		
		school.addClassroom(class2);

		Student student1 = new Student("Zain Reishi", 17, "FA24-BCS-001");
		
		Student student2 = new Student("Joseph Cassidy", 18, "FA24-BCS-002");
 
		Student student3 = new Student("Hasan Piracha", 16, "FA24-BCS-003");
		
		Student student4 = new Student("Ben Clark", 19, "FA24-BCS-004");
		
		Student student5 = new Student("Arthur Kennedy", 18, "FA24-BCS-005");
		
		Student student6 = new Student("Ramish Aziz", 17, "FA24-BCS-005");
		
		class1.enroll(student1);
		class1.enroll(student2);
		class1.enroll(student3);
		class1.enroll(student4);
		class1.enroll(student5);
		class1.enroll(student6);
		class2.enroll(student6);

		System.out.println(school.toString());
		
		Teacher teacher3 = new Teacher("Abraham Lincholn", 39, "Physics", 225);
			
		System.out.println("Do teacher1 and teacher2 have the same ID? " + teacher1.equals(teacher2) + "\n");
		System.out.println("Do teacher1 and teacher3 have the same ID? " + teacher1.equals(teacher3) + "\n");
		
		System.out.println("Do student5 and student6 have the same roll number? " + student5.equals(student6) + "\n");
		System.out.println("Do student5 and student1 have the same roll number? " + student5.equals(student1) + "\n");

	}
}