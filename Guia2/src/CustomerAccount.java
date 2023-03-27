import java.util.UUID;

public class CustomerAccount {
    private static String id = UUID.randomUUID().toString().toLowerCase().substring(0, 8);
    private String name;
    private char gender;

    public CustomerAccount(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public CustomerAccount() {}

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        CustomerAccount.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerAccount [id= "+ id +", name=" + name + ", gender=" + gender + "]";
    }    
}
