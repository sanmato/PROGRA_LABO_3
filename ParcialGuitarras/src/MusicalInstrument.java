public abstract class MusicalInstrument {
    private Double price;
    private String tradeMark;


    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getTradeMark() {
        return tradeMark;
    }
    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    @Override
    public String toString() {
        return "MusicalInstrument [price=" + price + ", tradeMark=" + tradeMark + "]";
    }

    public abstract Double calculatePrice();
    
}
