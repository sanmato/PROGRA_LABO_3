public class Main {
    public static void main(String[] args) {
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
}