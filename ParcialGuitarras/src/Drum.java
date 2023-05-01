public class Drum extends MusicalInstrument {

    private Integer numberOfDrums;
    private Integer numberOfCymbals;
    private static final int MIN_CYMBALS = 1;
    private static final int MAX_CYMBALS = 5;
    private static final int MAX_DRUMS = 3;
    private static final double DRUM_PRICE = 3000;
    private static final double CYMBAL_PRICE = 2000;

    

    public Drum() {}


    public Drum(Integer numberOfDrums, Integer numberOfCymbals, String tradeMark) {
        super.setTradeMark(tradeMark);
        setNumberOfDrums(numberOfDrums);
        setNumberOfCymbals(numberOfCymbals);
        super.setPrice(calculatePrice());
    }

    


    @Override
    public Double calculatePrice() {
        return (numberOfCymbals * CYMBAL_PRICE) + (numberOfDrums * DRUM_PRICE);
    }


    public Integer getNumberOfDrums() {
        return numberOfDrums;
    }


    public void setNumberOfDrums(Integer numberOfDrums) {
        if(numberOfDrums > MAX_DRUMS) {
            throw new IllegalArgumentException("SET VALUE MINOR OF 3");
        }
        this.numberOfDrums = numberOfDrums;
    }


    public Integer getNumberOfCymbals() {
        return numberOfCymbals;
    }


    public void setNumberOfCymbals(Integer numberOfCymbals) {
        if(numberOfCymbals < MIN_CYMBALS || numberOfCymbals > MAX_CYMBALS) {
            throw new IllegalArgumentException("SET VALUE BETWEEN 1 AND 5");
        }
        this.numberOfCymbals = numberOfCymbals;
    }


    public static int getMinCymbals() {
        return MIN_CYMBALS;
    }


    public static int getMaxCymbals() {
        return MAX_CYMBALS;
    }


    public static int getMaxDrums() {
        return MAX_DRUMS;
    }

    @Override
    public String toString() {
        return "Drum [numberOfDrums=" + numberOfDrums + 
        ", numberOfCymbals=" + numberOfCymbals + 
        ", " + super.toString() + "]";
    }
}
