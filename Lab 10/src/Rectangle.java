public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Rectangle: \n");
        str.append("Perimeter: " + perimeter() + "\n");
        str.append("Area: " + area() + "\n");
        return str.toString();
    }
}
