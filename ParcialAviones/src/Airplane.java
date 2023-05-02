public abstract class Airplane {
    private String modelName;
    private String tradeMark;
    private Integer fuelCapacity;
    private String engineType;
    private Integer seat;

    public Airplane(String modelName, String tradeMark, Integer fuelCapacity, String engineType, Integer seat) {
        this.modelName = modelName;
        this.tradeMark = tradeMark;
        this.fuelCapacity = fuelCapacity;
        this.engineType = engineType;
        this.seat = seat;
    }

    public Airplane() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Airplane [modelName=" + modelName + ", tradeMark=" + tradeMark + ", fuelCapacity=" + fuelCapacity
                + ", engineType=" + engineType + ", seat=" + seat + "]";
    }

    public void land() {
        if (Airport.getOperationCapacity() == 20) {
            System.out.println("Can't complete operation, capacity is full");
        } else {
            System.out.println(modelName + " Landed!");
            Airport.setOperationCapacity(Airport.getOperationCapacity() + 1);
        }
    }

    public void fly() {
        System.out.println(modelName + " Flying!");
    }

    public void lift() {
        System.out.println(modelName + " Lifting!");
        Airport.setOperationCapacity(Airport.getOperationCapacity() - 1);
        if (Airport.getOperationCapacity() == 0) {
            Airport.setOperationCapacity(0);
        }
    }
}
