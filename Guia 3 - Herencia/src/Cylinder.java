public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return (Math.PI*height*getRadius());
    }

    @Override
    public double calculateArea() {
        return ((2*Math.PI*getRadius()*height) + (2*super.calculateArea()));
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Subclass of=" + super.toString() +
                "height=" + height +
                "volume=" + calculateVolume() +
                '}';
    }
}
