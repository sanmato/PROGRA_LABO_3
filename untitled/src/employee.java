
public class employee {
    
    private long dni;
    private String name;
    private String last_name;
    private double salary;

    public employee(long dni, String name, String last_name, double salary) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public employee() {
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnualSalary() {
        return salary*12;
    }

    public double increaseSalary(double percentage) {
        double percent = percentage/100;
        double newSalary = salary + (salary*percent);
        setSalary(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Empleado[dni= " + dni + ", nombre=" + name + ", apellido=" + last_name + ", sueldo=" + salary + "]";
    }   
}