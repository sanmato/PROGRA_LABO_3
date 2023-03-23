import java.nio.file.AtomicMoveNotSupportedException;

public class Exercises {

    public void exerciseOne() {
        //Ejercicio 1.a
        Rectangle rec = new Rectangle(4, 9);

        //Ejercicio 1.b
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Base: " + rec.getBase());

        //Ejercicio 1.c
        System.out.println("Area: " + rec.calculateArea());
        System.out.println("Perimeter: " + rec.calculatePerimeter());

        //Ejercicio 1.d
        rec.setBase(7);
        rec.setHeight(5);

        //Ejercicio 1.e
        System.out.println("New Area: " + rec.calculateArea());
        System.out.println("New Perimeter: " + rec.calculatePerimeter());

        //Ejercicio 1.f
        Rectangle defaultRectangle = new Rectangle();

        System.out.println("Default Rectangle base: " + defaultRectangle.getBase());
        System.out.println("Default rectangle height: " + defaultRectangle.getHeight());
   }

    public void exerciseTwo() {
        //Ejercicio 2.a
        employee employee = new employee(23456345, "Carlos", "Gutierrez", 25000);
        
        //Ejercicio 2.b
        employee anotherEmployee = new employee(34234123, "Ana", "Sanchez", 27500);

        //Ejercicio 2.c
        System.out.println(employee.toString());
        System.out.println(anotherEmployee.toString());
        
        //Ejercicio 2.d
        employee.increaseSalary(15);
        System.out.println("Carlos new Salary: " + employee.getSalary());
        System.out.println("Carlos Anual Salary: " + employee.calculateAnualSalary());
    }

    public void exerciseThree() {

        //Ejercicio 3.a
        SaleItem shovel = new SaleItem(1, "Pala", 2, 12.75);

        //Ejercicio 3.b
        System.out.println(shovel.toString());
    }

    public void exerciseFour() {
        //Ejercicio 4.a
        BankAccount anAccount = new BankAccount(2, "Santiago", 15000);

        //Ejercicio 4.b
        anAccount.depositTransaction(2500);

        //Ejercicio 4.c
        anAccount.extractTransaction(1500);

        //Ejercicio 4.d
        anAccount.extractTransaction(30000);

        System.out.println(anAccount.toString());

    }

    public void exerciseFive() {
        Time time = new Time(6, 28, 35);
        System.out.println(time.toString());
        time.forward(time);
        System.out.println(time.toString());
        time.back(time);
        time.back(time);
        System.out.println(time.toString());
    }
}