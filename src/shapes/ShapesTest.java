package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);
        System.out.println("R Area: " + box1.getArea());
        System.out.println("R Perimeter: " + box1.getPerimeter());
        System.out.println("S Area: " + box2.getArea());
        System.out.println("S Perimeter: " + box2.getPerimeter());

    }
}
