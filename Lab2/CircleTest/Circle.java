import java.util.Scanner;
public class Circle {

	Scanner input = new Scanner(System.in);

	private double radius;
	
	public void inputRadius() {
	
	System.out.print("Enter the radius: ");
	
	radius = input.nextDouble();
}

	public double calArea() {
	
	return 3.14*radius*radius;
	}
	
	public double calCircumference() {
	
	return 2*3.14*radius;
	}

}
	
	
