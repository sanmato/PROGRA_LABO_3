public class AccousticGuitar extends StringInstrument{
    LumberType type;

    public AccousticGuitar(LumberType type, double price) {
        this.type = type;
        super.setNumberofStrings(6);
        setPrice(price);
    }

    public LumberType getType() {
        return type;
    }

    public void setType(LumberType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccousticGuitar [type=" + type + " " + super.toString() +"]";
    }

    @Override
    public Double calculatePrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatePrice'");
    } 
    
}
