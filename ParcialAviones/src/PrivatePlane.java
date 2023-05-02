public class PrivatePlane extends Airplane implements IAirplaneService {
    private Boolean isHaveJacuzzi;
    private String wifiPassword;

    public PrivatePlane(String modelName, String tradeMark, Integer fuelCapacity, String engineType, Integer seat,
            Boolean isHaveJacuzzi, String wifiPassword) {
        super(modelName, tradeMark, fuelCapacity, engineType, seat);
        this.isHaveJacuzzi = isHaveJacuzzi;
        this.wifiPassword = wifiPassword;
    }

    public PrivatePlane(Boolean isHaveJacuzzi, String wifiPassword) {
        this.isHaveJacuzzi = isHaveJacuzzi;
        this.wifiPassword = wifiPassword;
    }

    public PrivatePlane() {
    }

    @Override
    public void serveFood() {
        System.out.println("What a delicious creation, huh?");
    }

    @Override
    public void bringColdBlanket() {
        System.out.println("No more cold! look at this");
    }

    @Override
    public Boolean canWatchWorldCup() {
        return true;
    }

    public Boolean getIsHaveJacuzzi() {
        return isHaveJacuzzi;
    }

    public void setIsHaveJacuzzi(Boolean isHaveJacuzzi) {
        this.isHaveJacuzzi = isHaveJacuzzi;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }

    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    @Override
    public String toString() {
        return "PrivatePlane [isHaveJacuzzi=" + isHaveJacuzzi + ", wifiPassword=" + wifiPassword + "]";
    }

}
