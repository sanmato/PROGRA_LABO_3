import java.util.LinkedList;
import java.util.Scanner;

public class PremiumPlayList implements IPlayList{

    private String name;
    private LinkedList myList;

    public PremiumPlayList() {
    }

    public PremiumPlayList(String name) {
        this.name = name;
        this.myList = new LinkedList<>();
    }

    @Override
    public void play() {
        myList.forEach(song -> {
            System.out.println(song.toString());
        });

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Select an song to play: ");
        String songName = myScanner.nextLine();


    }

    @Override
    public void addSong(Song song) {

    }

    @Override
    public void removeSong(Song song) {

    }

    @Override
    public void displayList() {

    }
}
