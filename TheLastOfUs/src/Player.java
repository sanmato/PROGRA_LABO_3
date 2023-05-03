public abstract class Player extends Character {

    public Player(String name, String skin, String healthLevel, String weapon) {
        super(name, skin, healthLevel, weapon);
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

}
