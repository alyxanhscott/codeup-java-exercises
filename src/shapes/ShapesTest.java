package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Quadrilateral(5, 5);
        Measurable myShape1 = new Square(10);
        Measurable myShape2 = new Rectangle(20, 5);



        System.out.println("Shape Area: " + myShape2.getArea());
        System.out.println("Shape Perimeter: " + myShape2.getPerimeter());


    }
}
