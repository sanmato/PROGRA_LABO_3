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
        this.author = new Author[5];
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

    public Author[] getAuthor() {
        return author;
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

    public void printBookInfo(Author[] authors) {

        for (int i=0; i<authors.length; i++) {
            authors[i].getName();
        }
        System.out.printf("El libro "+title+ " del autor " +authors.toString()+ " se vende a $"+price);
    }


}
