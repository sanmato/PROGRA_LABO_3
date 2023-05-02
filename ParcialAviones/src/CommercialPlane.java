import java.util.ArrayList;

public class CommercialPlane extends Airplane implements IAirplaneService {
    private Integer stewardessNum;
    private ArrayList<Service> serviceList;

    public CommercialPlane(String modelName, String tradeMark, Integer fuelCapacity, String engineType, Integer seat,
            Integer stewardessNum) {
        super(modelName, tradeMark, fuelCapacity, engineType, seat);
        this.stewardessNum = stewardessNum;
        this.serviceList = new ArrayList<>();
    }

    public CommercialPlane(Integer stewardessNum) {
        this.stewardessNum = stewardessNum;
        this.serviceList = new ArrayList<>();
    }

    public Integer getStewardessNum() {
        return stewardessNum;
    }

    public void setStewardessNum(Integer stewardessNum) {
        this.stewardessNum = stewardessNum;
    }

    public ArrayList<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<Service> serviceList) {
        this.serviceList = serviceList;
    }

    @Override
    public String toString() {
        return "CommercialPlane [stewardessNum=" + stewardessNum + ", serviceList=" + serviceList + "]";
    }

    @Override
    public void serveFood() {
        System.out.println("The food has come!");
    }

    @Override
    public void bringColdBlanket() {
        System.out.println("No more cold, here you have a blanket");
    }

    @Override
    public Boolean canWatchWorldCup() {
        return false;
    }

}
