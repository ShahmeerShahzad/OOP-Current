import java.util.Scanner;
public class Rectangle {
	Scanner input = new Scanner(System.in);
	
	private double length;
	private double width;
	
	public void inputData() {
		System.out.print("Enter the length: ");
		length = input.nextDouble();

		System.out.print("Enter the width: ");
		width = input.nextDouble();
	
	}

	public double calArea() {
	return length * width;
	}

	public double calPerimeter() {
	return 2*(length) + 2*(width);
	}
	
	public void display() {
		System.out.printf("Length of rectangle: %.1f \n", length);
		System.out.printf("Width of rectangle: %.1f \n", width);
	}
}
	 

	 