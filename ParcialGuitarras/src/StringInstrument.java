public abstract class StringInstrument extends MusicalInstrument{
    private Integer numberofStrings;

    public Integer getNumberofStrings() {
        return numberofStrings;
    }

    public void setNumberofStrings(Integer numberofStrings) {
        this.numberofStrings = numberofStrings;
    }

    @Override
    public String toString() {
        return "StringInstrument [numberofStrings=" + numberofStrings + " " + super.toString() + "]";
    }

    
}
