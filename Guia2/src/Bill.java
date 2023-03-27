import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.UUID;

public class Bill {
    private static String id = UUID.randomUUID().toString().toLowerCase().substring(0, 8);
    private String date;
    private double totalAmount;
    private Customer customer;
    private SaleItem[] items;

    public Bill(double totalAmount, Customer customer) {
        this.date = gettingDate();
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public Bill(Customer customer, SaleItem[] items) {
        this.date = gettingDate();
        this.customer = customer;
        this.items = items;
        if (items != null) {
            this.totalAmount = calculateTotalAmountOfItems();
        } else {
            this.totalAmount = 0;
        }
    }

    private String gettingDate() {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return currentDate.format(formatter);
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SaleItem getItems(int index) {
        return items[index];
    }

    public void setItems(SaleItem[] items) {
        this.items = items;
    }
    
    public double calculateFinalAmount() {
        double discount = totalAmount * ((double) customer.getPercentDiscount()/100);
        double finalAmount = totalAmount - discount;
        return finalAmount;
    }

    public double calculateTotalAmountOfItems() {
        double totalAmountOfItems = 0;
        
        for(SaleItem allItems : items) {
            totalAmountOfItems += allItems.getPrice();
        }
        return totalAmountOfItems;
    }

    public double calculateTotalAmountOfItemsAfterDiscount() {
        double partialTotal = calculateTotalAmountOfItems();
        double discount = partialTotal * ((double) customer.getPercentDiscount()/100);
        double finalAmount = partialTotal - discount;
        return finalAmount;
    }

    public String getSaleItems() {
        String itemsList = "";
        for(SaleItem arrayOfItems : items) {
            itemsList += arrayOfItems.getName() + " ";
            itemsList += arrayOfItems.getPrice() + " - $";
        }

        itemsList = itemsList.substring(0, itemsList.length() -2);
        return itemsList;
    }

    @Override
    public String toString() {
        return "Bill [id=" + id + ", fecha=" + date + 
        ", \nItems: " + Arrays.toString(items) +
        ", \nsubtotal=" + totalAmount + ", total= " + calculateFinalAmount() + 
        ", cliente=" + customer + "]";
    }
}
