import java.util.ArrayList;

public class ChargePlane extends Airplane implements IJoinable {
    public Integer capacity;
    private ArrayList<Item> itemList;

    public ChargePlane(String modelName, String tradeMark, Integer fuelCapacity, String engineType, Integer capacity) {
        super(modelName, tradeMark, fuelCapacity, engineType, 0);
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    public ChargePlane(Integer capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    public ChargePlane() {
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "ChargePlane [capacity=" + capacity + ", itemList=" + itemList + "]";
    }

    @Override
    public Boolean join() {
        return true;
    }

    public void releaseItems() {
        System.out.println("Trivial... not available yet!");
    }

}
