public class Runner extends Zombie {
    private Integer speedRange;

    public Runner(String name, String skin, String healthLevel, String weapon, Integer cordycepsLevel,
            Integer speedRange) {
        super(name, skin, healthLevel, weapon, cordycepsLevel);
        this.speedRange = speedRange;
    }

    public Runner(Integer cordycepsLevel, Integer speedRange) {
        super(cordycepsLevel);
        this.speedRange = speedRange;
    }

    public Integer getSpeedRange() {
        return speedRange;
    }

    public void setSpeedRange(Integer speedRange) {
        this.speedRange = speedRange;
    }

    @Override
    public String toString() {
        return "Runner [speedRange=" + speedRange + "]";
    }

    @Override
    public void attack(Character character) {
        System.out.println("Attacking");
    }

    @Override
    public void bite() {
        System.out.println("Bitting");
    }

    @Override
    public void defend() {
        System.out.println("Defending");
    }

    @Override
    public void die() {
        System.out.println("Dead!");
    }

    @Override
    public void loadEnergy() {
        System.out.println("Loading Energy");
    }

    public void run() {
        System.out.println("Running!");
    }

}
