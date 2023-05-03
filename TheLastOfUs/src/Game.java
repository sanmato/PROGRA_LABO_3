import java.util.ArrayList;

public class Game {
    private ArrayList<Character> characterList;
    private ArrayList<Item> itemList;

    public Game() {
        this.characterList = new ArrayList<>();
        this.itemList = new ArrayList<>();
    }

    public ArrayList<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(ArrayList<Character> characterList) {
        this.characterList = characterList;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Game [characterList=" + characterList + ", itemList=" + itemList + "]";
    }

    public void addCharacterToList(Character character) {
        characterList.add(character);
    }

    public void addItemToList(Item item) {
        itemList.add(item);
    }

    public void printCharacterList() {
        characterList.forEach(character -> {
            System.out.println(character.toString());
        });
    }

    public void printItemList() {
        itemList.forEach(item -> {
            System.out.println(item.toString());
        });
    }

}
