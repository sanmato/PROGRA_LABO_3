public abstract class Furniture extends Product{

    public Furniture(Integer stock, String name, Double price) {
        super(stock, name, price);
    }

    @Override
    public String toString() {
        return "Furniture [ " + super.toString() + "]";
    }
}
