public class Rectangle extends GeometricFigure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        super.setColor("not colored");
    }

    public Rectangle() {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color=" + super.getColor()+
                '}';
    }

    @Override
    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return ((2*height) + (2*width));
    }
}
