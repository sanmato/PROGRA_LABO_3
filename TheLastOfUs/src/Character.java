public abstract class Character implements IAction {
    private String name;
    private String skin;
    private String healthLevel;
    private String weapon;

    public Character(String name, String skin, String healthLevel, String weapon) {
        this.name = name;
        this.skin = skin;
        this.healthLevel = healthLevel;
        this.weapon = weapon;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(String healthLevel) {
        this.healthLevel = healthLevel;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", skin=" + skin + ", healthLevel=" + healthLevel + ", weapon=" + weapon
                + "]";
    }

}
