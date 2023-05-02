public class MilitaryPlane extends Airplane implements IJoinable {
    private ArmsSystem armSystem;
    private Integer bullets;

    public MilitaryPlane() {
    }

    public MilitaryPlane(String modelName, String tradeMark, Integer fuelCapacity, String engineType, Integer seat,
            ArmsSystem armSystem, Integer bullets) {
        super(modelName, tradeMark, fuelCapacity, engineType, seat);
        this.armSystem = armSystem;
        this.bullets = bullets;
    }

    public MilitaryPlane(ArmsSystem armSystem, Integer bullets) {
        this.armSystem = armSystem;
        this.bullets = bullets;
    }

    @Override
    public Boolean join() {
        return false;
    }

    public ArmsSystem getArmSystem() {
        return armSystem;
    }

    public void setArmSystem(ArmsSystem armSystem) {
        this.armSystem = armSystem;
    }

    public Integer getBullets() {
        return bullets;
    }

    public void setBullets(Integer bullets) {
        this.bullets = bullets;
    }

    @Override
    public String toString() {
        return "MilitaryPlane [armSystem=" + armSystem + ", bullets=" + bullets + "]";
    }

}
