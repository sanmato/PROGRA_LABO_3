public class CircleExtended extends GeometricFigure{
    private double radius;

    public CircleExtended(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public CircleExtended(double radius) {
        this.radius = radius;
        super.setColor("not colored");
    }

    public CircleExtended() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleExtended{" +
                "radius=" + radius +
                ", color=" + super.getColor()+
                '}';
    }

    @Override
    public double getArea() {
        return (Math.PI*radius*radius);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*radius);
    }
}
