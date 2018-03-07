package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected  int width;

//constructor (below)
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return (width * 2) + (length *2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
