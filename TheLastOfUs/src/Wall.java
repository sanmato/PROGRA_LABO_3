public class Wall extends Item {
    private Integer resistance;

    public Wall(Double height, Double width, Integer resistance) {
        super(height, width);
        this.resistance = resistance;
    }

    public Wall(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return "Wall [resistance=" + resistance + "]";
    }

}
