public class Person {
    private String name;
    private Integer age;
    private String id;
    private char genre;
    private Double height;
    private Double weight;

    public Person(String name, Integer age, String id, char genre, Double height, Double weight) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.genre = genre;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, Integer age, char genre) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.id = null;
        this.height = 0.0;
        this.weight = 0.0;
    }

    public Person() {
        this.name = null;
        this.age = 0;
        this.genre = 'M';
        this.height = 0.0;
        this.weight = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", id=" + id + ", genre=" + genre + ", height=" + height
                + ", weight=" + weight + "]";
    }

}
