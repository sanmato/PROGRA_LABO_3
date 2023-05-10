import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws Exception {

        Person person = new Person("Santia", 29);
        Person person2 = new Person("Anto", 32);

        ArrayList<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person2);

        Gson gson = new Gson();

        try {
            FileWriter writer = new FileWriter("person.json");
            gson.toJson(list.toArray(new Person[0]), writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
