public abstract class Zombie extends Character implements IBite {
    private Integer cordycepsLevel;

    public Zombie(String name, String skin, String healthLevel, String weapon, Integer cordycepsLevel) {
        super(name, skin, healthLevel, weapon);
        this.cordycepsLevel = cordycepsLevel;
    }

    public Zombie(Integer cordycepsLevel) {
        this.cordycepsLevel = cordycepsLevel;
    }

    public Integer getCordycepsLevel() {
        return cordycepsLevel;
    }

    public void setCordycepsLevel(Integer cordycepsLevel) {
        this.cordycepsLevel = cordycepsLevel;
    }

    @Override
    public String toString() {
        return "Zombie [cordycepsLevel=" + cordycepsLevel + "]";
    }

    @Override
    public void attack(Character character) {
        System.out.println("Attacking to: " + character.getName());

    }

    @Override
    public void defend() {
        System.out.println("Defending!");
    }

    @Override
    public void die() {
        System.out.println("Character died!");
    }

    @Override
    public void loadEnergy() {
        System.out.println("loading!");
    }

    @Override
    public void bite() {
        System.out.println("Biting");
    }

}
