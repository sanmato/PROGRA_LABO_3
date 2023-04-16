import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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

    public void rentMovie(Movie movie, Customer customer, LocalDate acquireDate, LocalDate returnDate) {
        Movie existingMovie = findMovie(movie.getName());
        if(existingMovie == null) {
            System.out.println("Movie not found.");
        } else {
            if(existingMovie.getStock() == 0) {
                System.out.println("The movie is not available at the moment.");
            } else {
                Rent rent = new Rent(existingMovie, customer, acquireDate, returnDate);
                existingMovie.setStock(existingMovie.getStock() - 1);
                existingMovie.setPopularity(existingMovie.getPopularity() +1);
                rents.add(rent);
                System.out.println("Movie rented successfully.");
            }
        }
    }

    public void returnMovie(Movie movie, Customer customer, LocalDate returnDate) {
        for(Rent rent : rents) {
            if(rent.getCustomer().equals(customer) && rent.getMovie().equals(movie)) {
                movie.setStock(movie.getStock() +1);
                rent.setRentReturned(true);
            }
        }
    }

    public void printRentals() {
        rents.forEach(rental -> {
            if(rental.getRentReturned() == false) {
                System.out.println(rental.toString());
            }
        });
    }

    public void getRentsToBeBackedToday() {
        rents.forEach(rental -> {
            if(rental.getReturnDate().equals(LocalDate.now())) {
                System.out.println(rental.toString());
            }
        });
    }

    public String getLastRentsByCustomer(String customerName) {
        String list = "";
        int j = 0, i=rents.size()-1;
        while(i>=0 && j<10) {
            if(this.rents.get(i).getCustomer().getName().equals(customerName)) {
                list += this.rents.get(i).toString();
                j++;
            }
            i--;
        }
        return list;
    }

    public void getMostRentedMovies() {
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " - Popularity: " + movie.getPopularity());
        }

    }

    public void getMostRentedMoviesByGender(MovieGender gender) {
        List<Movie> genderMovies = movies.stream()
            .filter(movie -> movie.getGender().equals(gender))
            .sorted()
            .collect(Collectors.toList());

        for(Movie movie : genderMovies) {
            System.out.println(movie.getName() + " - Popularity: " + movie.getPopularity());
        }
    }

    public void printInfo(String movieTitle) {
        movies.forEach(movie -> {
            if(movie.getName().equals(movieTitle)) {
                System.out.println(movie.toString());
            }
        });
    }
    
}

