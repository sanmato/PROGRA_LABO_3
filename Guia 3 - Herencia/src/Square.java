public class Square extends Rectangle{
    public Square(String color, double side) {
        super(color, side, side);
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return getHeight()*4;
    }
}
