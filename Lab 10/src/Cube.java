public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return 6 * (Math.pow(side, 2));
    }

    @Override
    double Volume() {
        return Math.pow(side, 3);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Cube: \n");
        str.append("Surface Area: " + area() + "\n");
        str.append("Volume: " + Volume() + "\n");
        return str.toString();
    }
}
