public class Printer extends ComputerProduct implements IDiscoutable{
    private Integer printsPerMinute;

    public Printer(Integer stock, String name, Double price, String manufacturer, Integer printsPerMinute) {
        super(stock, name, price, manufacturer);
        this.printsPerMinute = printsPerMinute;
    }

    public Integer getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(Integer printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public String toString() {
        return "Printer [printsPerMinute=" + printsPerMinute + " " + super.toString() + "]";
    }

    @Override
    public double discount(Integer percentageDiscount) {
        setPrice(getPrice() - ((getPrice()*percentageDiscount)/100));
        return getPrice();
    }    
}
