import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PremiumPlayList implements IPlayList {

    // #region Attributes
    private String name;
    private LinkedList<Song> myList;

    // #region Constructors
    public PremiumPlayList() {
    }

    public PremiumPlayList(String name) {
        this.name = name;
        this.myList = new LinkedList<>();
    }
    // #endregion

    // #region Getters, Setters, toString
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getMyList() {
        return myList;
    }

    public void setMyList(LinkedList<Song> myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "PremiumPlayList [name=" + name + ", myList=" + myList + "]";
    }
    // #endregion

    // #region Overrided methods
    @Override
    public void play() {
        IntStream.range(0, myList.size())
            .forEach(index -> {
                System.out.println(index + ": " + myList.get(index));
            });

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Select a song to play: ");
        Integer songNumber = myScanner.nextInt();

        System.out.println("Now playing... " + myList.get(songNumber));
    }

    @Override
    public void addSong(Song song) {
        myList.add(song);
    }

    @Override
    public void removeSong() {
        IntStream.range(0, myList.size())
            .forEach(index -> {
                System.out.println(index + ": " + myList.get(index));
            });

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Select a song to delete: ");
            int songNumber = myScanner.nextInt();
            myScanner.nextLine();
        
            if (songNumber >= 0 && songNumber < myList.size()) {
                myList.remove(songNumber);
                System.out.println("Song removed successfully");
            } else {
                System.out.println("Invalid song number");
            }
    }

    @Override
    public void displayList() {
        myList.forEach(song -> {
            System.out.println(song.toString());
        });
    }
    // #endregion
}
