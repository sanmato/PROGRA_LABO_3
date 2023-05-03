public class Stalker extends Zombie {
    private Boolean isHidden;

    public Stalker(String name, String skin, String healthLevel, String weapon, Integer cordycepsLevel,
            Boolean isHidden) {
        super(name, skin, healthLevel, weapon, cordycepsLevel);
        this.isHidden = isHidden;
    }

    public Stalker(Integer cordycepsLevel, Boolean isHidden) {
        super(cordycepsLevel);
        this.isHidden = isHidden;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @Override
    public String toString() {
        return "Stalker [isHidden=" + isHidden + "]";
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

    public void gaze() {
        System.out.println("Stalker gazing player");
    }

}
