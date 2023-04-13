import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        MovieGender adventure = new MovieGender("Adventure");

        Movie movie1 = new Movie("Avengers", new Date(), 128, "PG-13", "USA", "SUPER HEROES", 13, adventure);
        Movie movie2 = new Movie("Avengers 2", new Date(), 129, "PG-13", "USA", "SUPER HEROES", 10, adventure);

        Customer santi = new Customer("santiago", "2236883508", "Ant Arg 2553");
        Customer santo = new Customer("santo", "2236883509", "Ant Arg 2556");

        store.addMovie(movie1);
        store.addMovie(movie2);

        store.rentMovie(movie1, santi, LocalDate.now(), LocalDate.now().plusDays(7));
        store.rentMovie(movie2, santo, LocalDate.now(), LocalDate.now());
        store.rentMovie(movie1, santi, LocalDate.now(), LocalDate.now().plusDays(7));

        store.printRentals();

        store.getRentsToBeBackedToday();

        store.getMostRentedMovies();

    }
}