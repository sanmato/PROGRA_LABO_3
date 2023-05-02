import java.util.ArrayList;

public class Airport {
    private Integer internationalCode;
    private String address;
    private static Integer operationCapacity;
    private ArrayList<Hangar> hangarList;

    public Airport(Integer internationalCode, String address) {
        this.internationalCode = internationalCode;
        this.address = address;
        operationCapacity = 0;
        hangarList = new ArrayList<>();
    }

    public Airport() {
    }

    public Integer getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(Integer internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Integer getOperationCapacity() {
        return operationCapacity;
    }

    public static void setOperationCapacity(Integer operationCapacity) {
        Airport.operationCapacity = operationCapacity;
    }

    public ArrayList<Hangar> getHangarList() {
        return hangarList;
    }

    public void setHangarList(ArrayList<Hangar> hangarList) {
        this.hangarList = hangarList;
    }

    @Override
    public String toString() {
        return "Airport [internationalCode=" + internationalCode + ", Address=" + address + "]";
    }

    public void liftAllFromHangar(Hangar hangar) {
        hangar.liftAll();
    }

}
