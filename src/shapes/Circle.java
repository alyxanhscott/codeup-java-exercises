package shapes;

public class Circle {

    private double radius;
//    private v public: private keeps structure orderly and restricts access outside class, public gives other classes access.

    public Circle(double radius) {
//        "this" refers to this instance of the circle class.
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

//    main method is calling the above methods
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
