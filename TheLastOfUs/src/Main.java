public class Main {
    public static void main(String[] args) throws Exception {
        Game game = new Game();

        Ellie ellie = new Ellie("Ellie", "skin1", "100", "Pistol", 10, 8);
        Zombie bloater = new Bloater(99, 44);
        bloater.setName("Dogor");

        game.addCharacterToList(ellie);
        game.addCharacterToList(bloater);

        game.printCharacterList();

        ellie.attack(bloater);
        bloater.die();
    }
}
