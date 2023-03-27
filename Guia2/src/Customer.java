import java.util.UUID;

public class Customer {
    private static String id = UUID.randomUUID().toString().toLowerCase().substring(0, 8);
    private String name;
    private String email;
    private int percentDiscount;

    public Customer(String name, String email, int percentDiscount) {
        this.name = name;
        this.email = email;
        this.percentDiscount = percentDiscount;
    }

    public Customer() {}
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public String toString() {
        return "Cliente[id=" + id +", nombre=" + name +", email=" + email +", descuento=" + percentDiscount
                +"]";
    }    
}
