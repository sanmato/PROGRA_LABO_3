import java.util.Collections;
import java.util.Stack;

public class BasicPlayList implements IPlayList{
    private String name;
    private Stack myList;

    public BasicPlayList() {
    }

    public BasicPlayList(String name) {
        this.name = name;
        this.myList = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack getMyList() {
        return myList;
    }

    public void setMyList(Stack myList) {
        this.myList = myList;
    }

    @Override
    public void play() {
        System.out.println("Now playing ..." + myList.peek());
        Collections.rotate(myList, 1);
    }

    @Override
    public void addSong(Song song) {
        System.out.println("PAGA RATA");
    }

    @Override
    public void removeSong(Song song) {
        System.out.println("PAGA RATA");
    }

    @Override
    public void displayList() {
        myList.forEach(song -> {
            System.out.println(song.toString());
        });
    }
}
