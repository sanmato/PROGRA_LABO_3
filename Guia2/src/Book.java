import java.util.Arrays;

public class Book {
    private String title;
    private double price;
    private int stock;
    private Author[] author;

    public Book() {
    }

    public Book(String title, double price, int stock, Author[] author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor(int index) {
        return author[index];
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + Arrays.toString(author) +
                '}';
    }

    public String getAuthorsName() {
        String authorsName = "";

        for(Author authorFullName : author) {
            authorsName += authorFullName.getName() + " ";
            authorsName += authorFullName.getLast_name() + ", ";
        }

        authorsName = authorsName.substring(0, authorsName.length() - 2);

        return authorsName;
    }

    public void printBookInfo() {
        System.out.println("El libro "+title+ " de los autores " +getAuthorsName()+ " se vende a $"+price);
    }


}
