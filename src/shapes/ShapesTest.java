package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
         myShape = new Square(10);
        System.out.println("Shape Area: " + myShape.getArea());
        System.out.println("Shape Perimeter: " + myShape.getPerimeter());

        myShape = new Rectangle(20, 5);
        System.out.println("Shape Area: " + myShape.getArea());
        System.out.println("Shape Perimeter: " + myShape.getPerimeter());


    }
}
