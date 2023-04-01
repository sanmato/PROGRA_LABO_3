import java.util.ArrayList;

public class College {
    private ArrayList<Person> persons;

    public College() {
        this.persons = new ArrayList<>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "College{" +
                "persons=" + persons +
                '}';
    }




    public void addPerson(Person person) {
        persons.add(person);
    }

    public double getStudentTotalAmountOfMonthlyDebt() {
        double amountedMonthlydebts = 0;
        for(Person person : persons) {
            if(person instanceof Student) {
                amountedMonthlydebts += ((Student) person).getMonthlyDue();
            }
        }
        return amountedMonthlydebts;
    }



}
