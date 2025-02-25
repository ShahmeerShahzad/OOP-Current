public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		
		r.inputData();
		double area = r.calArea();
		double perimeter = r.calPerimeter();
		r.display();
		
		System.out.printf("Area of the rectangle: %.1f \n", area);
		System.out.printf("Perimeter of the rectangle: %.1f \n", perimeter);
	}
}
	