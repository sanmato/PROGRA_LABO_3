public class Student extends Person {
    private Integer yearOfIncome;
    private Integer monthlyDue;
    private String career;

    public Student() {}

    public Student(Integer yearOfIncome, Integer monthlyDue, String career) {
        this.yearOfIncome = yearOfIncome;
        this.monthlyDue = monthlyDue;
        this.career = career;
    }

    public Student(long dni, String name, String lastName, String email, String address, Integer yearOfIncome, Integer monthlyDue, String career) {
        super(dni, name, lastName, email, address);
        this.yearOfIncome = yearOfIncome;
        this.monthlyDue = monthlyDue;
        this.career = career;
    }

    public Integer getYearOfIncome() {
        return yearOfIncome;
    }

    public void setYearOfIncome(Integer yearOfIncome) {
        this.yearOfIncome = yearOfIncome;
    }

    public Integer getMonthlyDue() {
        return monthlyDue;
    }

    public void setMonthlyDue(Integer monthlyDue) {
        this.monthlyDue = monthlyDue;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfIncome=" + yearOfIncome +
                ", monthlyDue=" + monthlyDue +
                ", career='" + career + '\'' +
                '}';
    }
}
