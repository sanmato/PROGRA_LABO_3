import java.util.UUID;

public class SaleItem {
    
    private static String id = UUID.randomUUID().toString().toLowerCase().substring(0, 8);
    private String name;
    private String description;
    private double price;

    public SaleItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public SaleItem() {}

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        SaleItem.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nObjeto[nombre=" + name + ", descripcion=" + description + ", precio= $" + price + "]";
    }


    

    
}
