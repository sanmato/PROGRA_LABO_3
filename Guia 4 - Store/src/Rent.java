import java.time.LocalDate;
import java.util.Date;

public class Rent {
    private Movie movie;
    private Customer customer;
    private LocalDate acquireDate;
    private LocalDate returnDate;

    private Boolean isRentReturned = false;


    public Rent(Movie movie, Customer customer, LocalDate acquireDate, LocalDate returnDate) {
        this.movie = movie;
        this.customer = customer;
        this.acquireDate = acquireDate;
        this.returnDate = returnDate;
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

    public LocalDate getAcquireDate() {
        return acquireDate;
    }

    public void setAcquireDate(LocalDate acquireDate) {
        this.acquireDate = acquireDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean getRentReturned() {
        return isRentReturned;
    }

    public void setRentReturned(Boolean rentReturned) {
        isRentReturned = rentReturned;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "movie=" + movie +
                ", customer=" + customer +
                ", acquireDate=" + acquireDate +
                ", returnDate=" + returnDate +
                ", isRentReturned=" + isRentReturned +
                '}';
    }
}
