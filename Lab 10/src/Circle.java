public class Circle extends Shape2D {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * Math.pow(radius,2);
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Circle: \n");
        str.append("Circumference: " + Circumference() + "\n");
        str.append("Area: " + area() + "\n");
        return str.toString();
    }
}
