import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Artist luca = new Artist("Luca Prodan", 34, "Itallian");
        Artist acdc = new Artist("AC/DC", 50, "Australlian");

        Album afterChabon = new Album(1987, "After Chabon", luca);
        Album backInBlack = new Album(1980, "Back in Black", acdc);

        Song hellsBells = new Song("Hells Bells", 313, Genre.ROCK, backInBlack, null);
        Song cruaChan = new Song("Crua Chan", 212, Genre.ROCK, afterChabon, null);
        Song shootToThrill = new Song("Shoot to Thrill", 320, Genre.ROCK, backInBlack, null);
        Song backinBlack = new Song("Back in Black", 256, Genre.ROCK, backInBlack, null);
        Song shook = new Song("You Shook Me All Night Long", 211, Genre.ROCK, backInBlack, null);
        Song noTanDistintos = new Song("No tan distintos", 162, Genre.ROCK, afterChabon, null);
        Song banderitas = new Song("Banderitas y Globos", 180, Genre.POP, afterChabon, null);
        Song cieguitoVolador = new Song("El cieguito volador", 201, Genre.ROCK, afterChabon, null);
        Song abasto = new Song("Mañana en el abasto", 248, Genre.ROCK, afterChabon, null);

        LinkedList songs = new LinkedList<Song>();
        songs.add(cieguitoVolador);
        songs.add(hellsBells);
        songs.add(cruaChan);
        songs.add(shootToThrill);
        songs.add(backinBlack);
        songs.add(shook);
        songs.add(noTanDistintos);
        songs.add(banderitas);
        songs.add(abasto);

        BasicPlayList basic = new BasicPlayList("vol1");
        PremiumPlayList premium = new PremiumPlayList("vol2");

        premium.addSong(hellsBells);
        premium.addSong(cruaChan);
        premium.addSong(noTanDistintos);

        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;

        while(!exit) {

            System.out.println("\n------ MAIN MENU ------");
            System.out.println("1. PLAY SONG");
            System.out.println("2. ADD A SONG TO THE PLAYLIST");
            System.out.println("3. DELETE A SONG OF THE PLAYLIST");
            System.out.println("4. DISPLAY PLAYLIST");
            System.out.println("5. EXIT");
            System.out.println("----------------------------");

            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("\n------ PLAY SONG ------");
                    boolean isPaused = false;
                    premium.play();
                    while(!isPaused) {
                        if (scanner.hasNextLine() && scanner.nextLine().equalsIgnoreCase("p")) {
                            isPaused = true;
                            System.out.println("Playback paused.");
                        }
                    }
                    break;
    
                case 2:
                    System.out.println("\n------ ADD SONG ------");
                    IntStream.range(0, songs.size())
                    .forEach(index -> {
                        System.out.println(index + ": " + songs.get(index));
                    });
                    System.out.println("Select a song to add to playlist: ");
                    Integer songNumber = scanner.nextInt();
                    premium.addSong((Song)songs.get(songNumber));
                    break;
    
                case 3:
                    System.out.println("\n------ DELETE SONG ------");
                    premium.removeSong();
                    break;
    
                case 4:
                    System.out.println("\n------ DISPLAY ------");
                    premium.displayList();
                    break;
    
                case 5:
                    exit = true;
                    break;
            }
        }


    }
}