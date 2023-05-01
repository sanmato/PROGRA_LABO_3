import java.util.ArrayList;

public class Store {
    private Drum drum;
    private ElectricGuitar electricGuitar;
    private Bass bass;
    private AccousticGuitar accousticGuitar;
    private ArrayList<MusicalInstrument> instrumentalList;

    public Store() {
        instrumentalList = new ArrayList<>();
    }

    public Drum getDrum() {
        return drum;
    }

    public void setDrum(Drum drum) {
        this.drum = drum;
    }

    public ElectricGuitar getElectricGuitar() {
        return electricGuitar;
    }

    public void setElectricGuitar(ElectricGuitar electricGuitar) {
        this.electricGuitar = electricGuitar;
    }

    public Bass getBass() {
        return bass;
    }

    public void setBass(Bass bass) {
        this.bass = bass;
    }

    public AccousticGuitar getAccousticGuitar() {
        return accousticGuitar;
    }

    public void setAccousticGuitar(AccousticGuitar accousticGuitar) {
        this.accousticGuitar = accousticGuitar;
    }

    public ArrayList<MusicalInstrument> getInstrumentalList() {
        return instrumentalList;
    }

    public void setInstrumentalList(ArrayList<MusicalInstrument> instrumentalList) {
        this.instrumentalList = instrumentalList;
    }

    public void addToList(MusicalInstrument instrument) {
        instrumentalList.add(instrument);
    }

    public void printList() {
        instrumentalList.forEach(instrument -> {
            System.out.println(instrument);
        });
    }

    public void increasePrice() {
        System.out.println("Before");
        printList();
        instrumentalList.forEach(instrument -> {
            if(instrument instanceof Bass) {
                instrument.setPrice(instrument.getPrice() + (instrument.getPrice()*0.20));
            } else if(instrument instanceof ElectricGuitar) {
                instrument.setPrice(instrument.getPrice() + (instrument.getPrice()*0.05));
            } else if(instrument instanceof AccousticGuitar) {
                instrument.setPrice(instrument.getPrice() + (instrument.getPrice()*0.10));
            } else if(instrument instanceof Drum) {
                instrument.setPrice(instrument.getPrice() + (instrument.getPrice()*0.15));
            }
        });
        System.out.println("After");
        printList();
    }
    
}
