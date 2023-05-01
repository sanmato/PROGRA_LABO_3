public class Main {
    public static void main(String[] args) throws Exception {
        Printer printerOne = new Printer(3, "LaserJet", 20000.00, "Epson", 27);
        Chair chairOne = new Chair(2, "Cosme", 10500.00, true);
        Desk deskOne = new Desk(2, "Fulanito", 80500.00, 2.5, 3.0);
        Notebook notebookOne = new Notebook(1, "HP GROSA", 125000.00, "HP", 16);

        StoreManager manager = new StoreManager();

        manager.addToList(notebookOne);
        manager.addToList(printerOne);
        manager.addToList(chairOne);
        manager.addToList(deskOne);

        printerOne.discount(10);

        manager.increasePrice();
    }
}
