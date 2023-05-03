public class Ellie extends Player {
    private Integer moodLevel;
    private Integer badJokeTotal;

    public Ellie(String name, String skin, String healthLevel, String weapon, Integer moodLevel, Integer badJokeTotal) {
        super(name, skin, healthLevel, weapon);
        this.moodLevel = moodLevel;
        this.badJokeTotal = badJokeTotal;
    }

    public Integer getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(Integer moodLevel) {
        this.moodLevel = moodLevel;
    }

    public Integer getBadJokeTotal() {
        return badJokeTotal;
    }

    public void setBadJokeTotal(Integer badJokeTotal) {
        this.badJokeTotal = badJokeTotal;
    }

    @Override
    public String toString() {
        return "Ellie [moodLevel=" + moodLevel + ", badJokeTotal=" + badJokeTotal + "]";
    }

}
