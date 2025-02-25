public class StudentTest {
	public static void main(String args[]) {
		StudentInfo obj1 = new StudentInfo("Lahore", "Shahmeer Shahzad", "DHA", 3.5);
		StudentInfo obj2 = new StudentInfo("Lahore", "Abdul Wahab", "Johar Town", 3.9);
		
		obj1.Display();
		obj2.Display();

		obj1.setName("Ahmed Akthar");
		obj1.setGPA(3.7);
		obj1.setAddress("Model Town");
		
		obj1.Display();
	}
}