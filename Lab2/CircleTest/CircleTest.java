public class CircleTest {

	public static void main(String args[]) {
		
	Circle c = new Circle();
	
	c.inputRadius();
	
	double area = c.calArea();
	
	double circumference = c.calCircumference();

	System.out.printf("Area: %.1f \n", area);

	System.out.printf("Circumference: %.1f \n", circumference);

	}
}
