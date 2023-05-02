public class Item {
    private String name;
    private String description;
    private Double weight;

    public Item(String name, String description, Double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", description=" + description + ", weight=" + weight + "]";
    }

}
