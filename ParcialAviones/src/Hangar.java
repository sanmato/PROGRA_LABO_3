import java.util.ArrayList;

public class Hangar {
    private ArrayList<Airplane> airplaneList;
    private String name;

    public Hangar(String name) {
        this.airplaneList = new ArrayList<>();
        this.name = name;
    }

    public Hangar() {
    }

    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hangar [airplaneList=" + airplaneList + ", name=" + name + "]";
    }

    public void addAirplane(Airplane airplane) {
        airplaneList.add(airplane);
    }

    public void showAirplanes() {
        airplaneList.forEach(airplane -> {
            System.out.println(airplane.toString());
        });
    }

    public void liftAll() {
        airplaneList.forEach(airplane -> {
            airplane.lift();
        });
    }

}
