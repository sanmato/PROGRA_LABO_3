public class StaffMember extends Person{
    private Double salary;
    private String turn;

    public StaffMember(Double salary, String turn) {
        this.salary = salary;
        this.turn = turn;
    }

    public StaffMember(long dni, String name, String lastName, String email, String address, Double salary, String turn) {
        super(dni, name, lastName, email, address);
        this.salary = salary;
        this.turn = turn;
    }

    public StaffMember() {
    }
}
