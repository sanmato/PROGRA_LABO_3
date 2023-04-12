import java.time.LocalDate;
import java.util.Date;

public class Rent {
    private Movie movie;
    private Customer customer;
    private Date acquireDate;
    private LocalDate returnDate = null;


    public Rent(Movie movie, Customer customer, Date acquireDate) {
        this.movie = movie;
        this.customer = customer;
        this.acquireDate = acquireDate;
    }

    public Rent(){}

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getAcquireDate() {
        return acquireDate;
    }

    public void setAcquireDate(Date acquireDate) {
        this.acquireDate = acquireDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate localDate) {
        this.returnDate = localDate;
    }

    @Override
    public String toString() {
        return "Rent [movie=" + movie + ", customer=" + customer + ", acquireDate=" + acquireDate + ", returnDate="
                + returnDate + "]";
    }

    

    
}
