public class Clicker extends Zombie {
    private Integer blindedLevel;

    public Clicker(String name, String skin, String healthLevel, String weapon, Integer cordycepsLevel,
            Integer blindedLevel) {
        super(name, skin, healthLevel, weapon, cordycepsLevel);
        this.blindedLevel = blindedLevel;
    }

    public Clicker(Integer cordycepsLevel, Integer blindedLevel) {
        super(cordycepsLevel);
        this.blindedLevel = blindedLevel;
    }

    public Integer getBlindedLevel() {
        return blindedLevel;
    }

    public void setBlindedLevel(Integer blindedLevel) {
        this.blindedLevel = blindedLevel;
    }

    @Override
    public String toString() {
        return "Clicker [blindedLevel=" + blindedLevel + "]";
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

    public void scream() {
        System.out.println("Clicker alerted");
    }

}
