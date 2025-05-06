public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double Volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Sphere: \n");
        str.append("Surface Area: " + area() + "\n");
        str.append("Volume: " + Volume() + "\n");
        return str.toString();
    }
}
