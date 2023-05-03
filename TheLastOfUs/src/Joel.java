public class Joel extends Player {
    private Integer badVibeLevel;
    private Integer strongHeadedLevel;

    public Joel(String name, String skin, String healthLevel, String weapon, Integer badVibeLevel,
            Integer strongHeadedLevel) {
        super(name, skin, healthLevel, weapon);
        this.badVibeLevel = badVibeLevel;
        this.strongHeadedLevel = strongHeadedLevel;
    }

    public Integer getBadVibeLevel() {
        return badVibeLevel;
    }

    public void setBadVibeLevel(Integer badVibeLevel) {
        this.badVibeLevel = badVibeLevel;
    }

    public Integer getStrongHeadedLevel() {
        return strongHeadedLevel;
    }

    public void setStrongHeadedLevel(Integer strongHeadedLevel) {
        this.strongHeadedLevel = strongHeadedLevel;
    }

    @Override
    public String toString() {
        return "Joel [badVibeLevel=" + badVibeLevel + ", strongHeadedLevel=" + strongHeadedLevel + "]";
    }

}
