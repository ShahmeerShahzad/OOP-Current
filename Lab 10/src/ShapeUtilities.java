public class ShapeUtilities {
    public static void shapeCount(Shape[] shapes) {
        int rCount = 0;
        int cCount = 0;
        int sCount = 0;
        int cuCount = 0;

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Rectangle) {
                rCount++;
            }
            else if(shapes[i] instanceof Circle) {
                cCount++;
            } else if (shapes[i] instanceof  Sphere) {
                sCount++;
            }
            else {
                cuCount++;
            }
        }
        System.out.println("Shape Count: " );
        System.out.println("Rectangle Count: " + rCount);
        System.out.println("Circle Count: " + cCount);
        System.out.println("Sphere Count: " + sCount);
        System.out.println("Cube Count: " + cuCount +"\n");
    }

    public static void dupChecker(Shape[] shapes) {
        int circleDup = 0;
        int rectangleDup = 0;
        int sphereDup = 0;
        int cubeDup = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                double r = ((Circle) shapes[i]).getRadius();
                for (int j = 0; j < i; j++) {
                    if (shapes[j] instanceof  Circle && ((Circle) shapes[j]).getRadius() == r) {
                        circleDup++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < shapes.length; i++) {
             if (shapes[i] instanceof  Rectangle) {
                double l = ((Rectangle) shapes[i]).getLength();
                double w = ((Rectangle) shapes[i]).getWidth();
                for (int j = 0; j < i; j++) {
                    if (shapes[j] instanceof  Rectangle && ((Rectangle) shapes[j]).getLength() == l && ((Rectangle) shapes[j]).getWidth() == w) {
                        rectangleDup++;
                        break;
                    }

                }
            }
        }
        for (int i = 0; i < shapes.length; i++) {
             if (shapes[i] instanceof Sphere) {
                double r = ((Sphere) shapes[i]).getRadius();
                for (int j = 0; j < i; j++) {
                    if (shapes[j] instanceof  Sphere && ((Sphere) shapes[j]).getRadius() == r) {
                        sphereDup++;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Cube) {
                double s = ((Cube) shapes[i]).getSide();
                for (int j = 0; j < i; j++) {
                    if (shapes[j] instanceof  Cube && ((Cube) shapes[j]).getSide() == s) {
                        cubeDup++;
                        break;
                    }
                }
            }
        }

        System.out.println("Duplicate Count: ");
        System.out.println("Circle Duplicates: " + circleDup);
        System.out.println("Rectangle Duplicates: " + rectangleDup);
        System.out.println("Sphere Duplicates: " + sphereDup);
        System.out.println("Cube Duplicates: " + cubeDup);
    }

}
