import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

    public static void writeFile(ArrayList<Person> list, String fileName) {
        Gson gson = new Gson();

        try {
            FileWriter writer = new FileWriter(fileName);
            gson.toJson(list.toArray(new Person[0]), writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String route) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(route))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void readFileFromGson(String route) {
        File file = new File(route);

        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            Gson gson = new Gson();
            Type personListType = new TypeToken<List<Person>>() {}.getType();
            List<Person> personList = gson.fromJson(bf, personListType);

            personList.forEach(person -> {
                System.out.println(person);
            });
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception {

        Person person = new Person("Santia", 29);
        Person person2 = new Person("Dogo", 32);

        ArrayList<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person2);

        //writeFile(list, "person.json");
        //System.out.println(readFile("person.json"));
        readFileFromGson("person.json");
    }



}
