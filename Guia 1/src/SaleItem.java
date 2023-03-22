
public class SaleItem {
    private int id;
    private String description;
    private int quantity;
    private double price;

    public SaleItem(int id, String description, int quantity, double price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotalPrice() {
        return price*quantity;
    }

    public void showItemData(int id, String description, int quantity, double price, double total_price) {
        System.out.println("ItemVenta[id=" + id + ", descripcion=" + description + ", cantidad=" + quantity + ", pUnitario=" + price + ", pTotal="+ total_price +"]");
    }   

    


}