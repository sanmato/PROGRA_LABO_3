import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        List<Person> persons = person.readPersonJsonFile("generated.json");

        MajorPersonGeneric<Person> majorPersons = new MajorPersonGeneric<>();

        majorPersons.filterFromList(persons, 18);

        // System.out.println(majorPersons.getItems());

        HashSet<String> authors = majorPersons.saveAuthors();

        System.out.println(authors);

    }
}
