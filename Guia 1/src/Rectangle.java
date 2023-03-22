
public class Rectangle {

    private double height = 1.0;
    private double base = 1.0;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Rectangle() {
        
    }
    
    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea() {
        return base*height;
    }

    public double calculatePerimeter() {
        return ((2*base) + (2*height));
    }   
}