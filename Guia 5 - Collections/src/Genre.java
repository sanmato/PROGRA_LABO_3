public enum Genre {
    ROCK("ROCK"), TRAP("TRAP"), JAZZ("JAZZ"), HIPHOP("HIPHOP"), POP("POP"), METAL("METAL"), CLASSIC("CLASSIC");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
