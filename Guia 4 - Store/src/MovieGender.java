public class MovieGender {

    private String name;


    public MovieGender(String name) {
        this.name = name;
    }

    public MovieGender() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MovieGender [name=" + name + "]";
    }

    
    
}
