package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return this.getWidth() * 4;
    }

    @Override
    public int getPerimeter() {
        return (int)Math.pow(getWidth(), 2);
    }
}
