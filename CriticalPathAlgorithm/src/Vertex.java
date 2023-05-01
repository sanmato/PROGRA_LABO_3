public class Vertex {
    private String name;
    private int duration;

    public Vertex(String name) {
        this.name = name;
    }

    public Vertex(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

}
