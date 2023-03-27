public class Exercise {

    public void exerciseOne() {
        Author joshua = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        Author santi = new Author("Santi", "Manuel", "santi@email.com", 'M');

        Author[] authors = {joshua, santi};

        System.out.println(joshua.toString());

        Book java = new Book("Effective Java", 450, 150, authors);
        System.out.println(java.toString());
        java.setPrice(500);
        java.setStock(java.getStock()+50);

        for(int i = 0; i<authors.length; i++) {
            System.out.println(java.getAuthor(i));
        }

        java.printBookInfo();
    }

    public void exerciseTwo() {
        //Ejercicio 2
        //2.b
        Customer santi = new Customer("Santiago", "Santiago@email.com", 15);
        System.out.println(santi.toString());

        //2.c
        Bill santiBill = new Bill(10000, santi);
        System.out.println("Monto total: "+santiBill.getTotalAmount());
        System.out.println("Monto total con descuento aplicado: "+santiBill.calculateFinalAmount());

        //2.d
        System.out.println(santiBill.toString());

        //2.e
        SaleItem item1 = new SaleItem("Sierra de Leñador", "Sierra de profesion", 15000);
        SaleItem item2 = new SaleItem("Bate de Beisbol", "Objeto Deportivo", 8700);

        SaleItem items[] = {item1, item2};
        Bill newSantiBill = new Bill(santi, items);

        System.out.println(newSantiBill.toString());
    }

    void exerciseThree() {
        //3.a
        CustomerAccount client = new CustomerAccount("Santiago", 'm');
        System.out.println(client.toString());

        //3.b
        BankAccount myAccount = new BankAccount(10000, client);

        //3.c
        myAccount.creditTransaction();
        System.out.println(myAccount.getBalance());

        myAccount.extractTransaction();
        System.out.println(myAccount.toString());

        //3.d
        int numberOfOperations = 10;
        int i = 0;
        while(i<numberOfOperations) {
            myAccount.creditTransaction();
            System.out.println(myAccount.getBalance());

            myAccount.extractTransaction();
            System.out.println(myAccount.toString());
            System.out.println("Operation number "+i);
            i++;
        }

    }
    
}
