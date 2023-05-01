public class Chair extends Furniture implements IDiscoutable {
    private Boolean isHaveWheels;

    public Chair(Integer stock, String name, Double price, Boolean isHaveWheels) {
        super(stock, name, price);
        this.isHaveWheels = isHaveWheels;
    }

    public Boolean getIsHaveWheels() {
        return isHaveWheels;
    }

    public void setIsHaveWheels(Boolean isHaveWheels) {
        this.isHaveWheels = isHaveWheels;
    }

    @Override
    public String toString() {
        return "Chair [isHaveWheels=" + isHaveWheels + " " + super.toString() + "]";
    }

    @Override
    public double discount(Integer percentageDiscount) {
        setPrice(getPrice() - ((getPrice()*percentageDiscount)/100));
        return getPrice();
    }
    
}
