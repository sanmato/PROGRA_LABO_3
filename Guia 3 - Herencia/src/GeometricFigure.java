public abstract class GeometricFigure {
    private String color;

    public GeometricFigure(String color) {
        this.color = color;
    }

    public GeometricFigure() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "color= " + color +
                '\'' +
                '}';
    }

    public abstract double getPerimeter();
    public abstract double getArea();
}
