package shapes;
import util.Input;


public class CircleApp {

    private static Input I = new Input();

    public static void main(String[] args) {
        double d = I.getDouble("Enter a radius: ");

        Circle c = new Circle(d);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
