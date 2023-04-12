import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        MovieGender adventure = new MovieGender("Adventure");

        Movie movie1 = new Movie("Avengers", new Date(), 128, "PG-13", "USA", "SUPER HEROES", 13, adventure);
        System.out.println(movie1.toString());
    }
}