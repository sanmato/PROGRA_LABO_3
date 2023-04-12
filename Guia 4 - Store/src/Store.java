import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Store {
    private ArrayList<Movie> movies;
    private ArrayList<Customer> customers;
    private ArrayList<Rent> rents;

    public Store() {
        this.movies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rents = new ArrayList<>();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Rent> getRents() {
        return rents;
    }

    public void setRents(ArrayList<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public String toString() {
        return "Store [movies=" + movies + ", customers=" + customers + ", rents=" + rents + "]";
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    
    public Movie findMovie(String title) {
        for(Movie movie: movies) {
            if(movie.getName().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    public Customer findCustomer(String name) {
        for(Customer customer: customers) {
            if(customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
    
    public void rentMovie(Movie movie, Customer customer, Date acquireDate, LocalDate returnDate) {
        Rent rent = new Rent(movie, customer, acquireDate);
        if(movie.getStock() == 0) {
            System.out.println("Can't complete action");
        } else {
            movie.setStock(movie.getStock() -1 );
            rents.add(rent);
        }
    }

    public void returnMovie(Movie movie, Customer customer, Date returnDate) {
        for(Rent rent : rents) {
            if(rent.getCustomer().equals(customer) && rent.getMovie().equals(movie)) {
                movie.setStock(movie.getStock() +1);
                rent.setReturnDate(LocalDate.now());
            }
        }
    }
    
}
