public class Main {
    public static void main(String[] args) throws Exception {
        Store myStore = new Store();

        Drum drumOne = new Drum(3, 4, "Burzaco");
        Drum drumTwo = new Drum(3, 3, "Llavallol");
        AccousticGuitar guitarOne = new AccousticGuitar(LumberType.MAHOGANY, 14000);
        ElectricGuitar guitarTwo = new ElectricGuitar("Fender", 20000);
        Bass bassOne = new Bass("Fender", 40000);

        myStore.addToList(drumOne);
        myStore.addToList(drumTwo);
        myStore.addToList(guitarOne);
        myStore.addToList(guitarTwo);
        myStore.addToList(bassOne);

        myStore.increasePrice();
    }
}
