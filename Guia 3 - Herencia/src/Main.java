public class Main {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        System.out.println(myCylinder.toString());
        Cylinder mySecondCylinder = new Cylinder(4, "Green", 3);
        System.out.println(mySecondCylinder.toString());
        System.out.println("Cylinder area= "+mySecondCylinder.calculateArea() + "\nCylinder volume="
                +mySecondCylinder.calculateVolume());


        Student studentOne = new Student(41307627, "Santiago", "Mato",
                "santiago@mail.com", "Ant Arg 2553", 2021, 10000, "TUP");



    }
}