import java.util.ArrayList;

public class StoreManager {
    private ArrayList<Product> productList;

    public StoreManager() {
        productList = new ArrayList<>();
    }

    public void addToList(Product product) {
        productList.add(product);
    }

    public void printList() {
        productList.forEach(product -> {
            System.out.println(product.toString());
        });
    }

    public void increasePrice() {
        System.out.println("Not increased");
        printList();
        productList.forEach(product -> {
            if(product instanceof Chair) {
                product.setPrice(product.getPrice() + (product.getPrice()*0.05));
            } else if(product instanceof Desk) {
                product.setPrice(product.getPrice() + (product.getPrice()*0.10));
            } else if(product instanceof Printer) {
                product.setPrice(product.getPrice() + (product.getPrice()*0.15));
            } else if(product instanceof Notebook) {
                product.setPrice(product.getPrice() + (product.getPrice()*0.20));
            }
        });
        System.out.println("Increased");
        printList();
    }
    
}
