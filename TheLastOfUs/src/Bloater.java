public class Bloater extends Zombie implements ICamouflage {
    private Integer sporeTotal;

    public Bloater(String name, String skin, String healthLevel, String weapon, Integer cordycepsLevel,
            Integer sporeTotal) {
        super(name, skin, healthLevel, weapon, cordycepsLevel);
        this.sporeTotal = sporeTotal;
    }

    public Bloater(Integer cordycepsLevel, Integer sporeTotal) {
        super(cordycepsLevel);
        this.sporeTotal = sporeTotal;
    }

    public Integer getSporeTotal() {
        return sporeTotal;
    }

    public void setSporeTotal(Integer sporeTotal) {
        this.sporeTotal = sporeTotal;
    }

    @Override
    public String toString() {
        return "Bloater [sporeTotal=" + sporeTotal + "]";
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

    @Override
    public void camouflate() {
        System.out.println("Bloater is now hidden!");
    }

}
