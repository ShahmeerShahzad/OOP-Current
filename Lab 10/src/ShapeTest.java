public class ShapeTest {
    public static void main(String[] args) {
        /*Shape s1;
        Shape2D s2;
        Shape3D s3;

        Circle c1 = new Circle();
        c1.setRadius(3);

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(10);

        Sphere sp1 = new Sphere();
        sp1.setRadius(6);

        Cube cu1 = new Cube();
        cu1.setSide(7);

        //Main
        System.out.println("Circle:");
        System.out.println("Circumference: " + c1.Circumference());
        System.out.println("Area: " + c1.area() + "\n");

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Area: " + r1.area() + "\n");

        System.out.println("Sphere:");
        System.out.println("Surface Area: " + sp1.area());
        System.out.println("Volume: " + sp1.Volume() + "\n");

        System.out.println("Cube:");
        System.out.println("Surface Area: " + cu1.area());
        System.out.println("Volume: " + cu1.Volume() + "\n"); */

        int circleCounter = 1;
        int rectangleCounter = 1;
        int sphereCounter = 5;
        int cubeCounter = 4;

        Shape[] shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            if (i < 5) {
                shapes[i] = new Circle(circleCounter++);
            }
            else if (i >= 5 && i < 10) {
                shapes[i] = new Rectangle(rectangleCounter++, rectangleCounter++);
            }
            else if (i >= 10 && i < 15) {
                shapes[i] = new Sphere(sphereCounter++);
            }
            else {
                shapes[i] = new Cube(cubeCounter++);
            }
        }
        /* shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Sphere(7);
        shapes[3] = new Cube(2);
        shapes[4] = new Circle(3);
        shapes[5] = new Rectangle(4,5);
        shapes[6] = new Sphere(9);
        shapes[7] = new Cube(4);
        shapes[8] = new Circle(5);
        shapes[9] = new Rectangle(5,6);
        shapes[10] = new Sphere(9);
        shapes[11] = new Cube(6);
        shapes[12] = new Circle(7);
        shapes[13] = new Rectangle(5,6);
        shapes[14] = new Sphere(9);
        shapes[15] = new Cube(8);
        shapes[16] = new Circle(9);
        shapes[17] = new Rectangle(5,6);
        shapes[18] = new Sphere(11);
        shapes[19] = new Circle(10); */

       /* for(Shape shape : shapes) {
            System.out.println(shape);
        }
            */
        ShapeUtilities su = new ShapeUtilities();
        su.shapeCount(shapes);
        su.dupChecker(shapes);
    }
}
