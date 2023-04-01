public class Main {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        System.out.println(myCylinder.toString());
        Cylinder mySecondCylinder = new Cylinder(4, "Green", 3);
        System.out.println(mySecondCylinder.toString());
        System.out.println("Cylinder area= "+mySecondCylinder.calculateArea() + "\nCylinder volume="
                +mySecondCylinder.calculateVolume());



        //region Estudiantes
        Student studentOne = new Student(41307627, "Santiago", "Mato",
                "santiago@mail.com", "Ant Arg 2553", 2021, 10000, "TUP");

        Student studentTwo = new Student(41307628, "Santiag", "Mat",
                "santiago@gmail.com", "Ant Arg 2554", 2020, 10001, "INT");

        Student studentThree = new Student(41307629, "Santia", "Ma",
                "santiago@shemail.com", "Ant Arg 2555", 2019, 10002, "DOU");

        Student studentFour = new Student(41307630, "Santi", "Mo",
                "santiago@hemail.com", "Ant Arg 2556", 2019, 10003, "FLO");
        //endregion

        //region Miembros Staff
        StaffMember rector = new StaffMember(42307627, "Mario", "Santos",
                "simulador1@mail.com", "El Capulin 33", 300000.00, "Night");

        StaffMember teacher = new StaffMember(42307628, "Emilio", "Ravenna",
                "simulador2@mail.com", "El Capulin 34", 250000.00, "Night");

        StaffMember auditor = new StaffMember(42307629, "Gabriel", "Medina",
                "simulador3@mail.com", "El Capulin 35", 200000.00, "Night");

        StaffMember technic = new StaffMember(42307630, "Pablo", "Lamponne",
                "simulador4@mail.com", "El Capulin 36", 150000.00, "Night");

        //endregion

        College college = new College();

        college.addPerson(studentOne);
        college.addPerson(studentTwo);
        college.addPerson(studentThree);
        college.addPerson(studentFour);
        college.addPerson(rector);
        college.addPerson(technic);
        college.addPerson(teacher);
        college.addPerson(auditor);

        System.out.println(college.toString());

        System.out.println("Total of Monthly Debts of Students: " + college.getStudentTotalAmountOfMonthlyDebt());

        CircleExtended myCircle = new CircleExtended(4);
        myCircle.getArea();
        System.out.println(myCircle.toString());
        System.out.println("Circle area: "+myCircle.getArea());



    }
}