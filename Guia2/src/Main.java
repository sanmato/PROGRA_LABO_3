public class Main {
    public static void main(String[] args) {
        Author joshua = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(joshua.toString());

        Book java = new Book("Effective Java", 450, 150, joshua);
        System.out.println(java.toString());
        java.setPrice(500);
        java.setStock(java.getStock()+50);

        System.out.println(java.getAuthor());

        java.printBookInfo();
    }
}