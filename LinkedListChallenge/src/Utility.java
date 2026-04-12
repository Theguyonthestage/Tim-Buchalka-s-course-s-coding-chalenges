import java.util.ListIterator;


public class Utility {
    boolean goingForward = true;
    Playlist playlist;

    public Utility(Playlist playlist) {
        this.playlist = playlist;
    }

    public void play() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }
        ListIterator<Song> iterator = playlist.getIterator();

        while (true) {
            Song currentSong = null;
            if (goingForward) {

                if (iterator.hasNext()) {
                    currentSong = iterator.next();
                    if (currentSong != null) {
                        System.out.println("Current song: " + currentSong.getTitle());
                    }
                } else System.out.println("No more songs in playlist!");
            } else {
                if (iterator.hasPrevious()) {
                    currentSong = iterator.previous();
                    if (currentSong != null) {
                        System.out.println("Current song: " + currentSong.getTitle());
                    }
                } else System.out.println("No previous song is available!");
            }
            int choice = Main.printMenu();

            switch (choice) {
                case 0:
                    return;

                case 1:

                    if (!goingForward) {
                        if (iterator.hasNext()) iterator.next();
                    }
                    goingForward = true;
                    break;
                case 2:
                    if (goingForward) {
                        if (iterator.hasPrevious()) iterator.previous();
                    }
                    goingForward = false;
                    break;
                case 3:
                    if (goingForward) {
                        iterator.previous();
                        iterator.next();
                    } else if (!goingForward) {
                        iterator.next();
                        iterator.previous();

                    }
                    break;
                case 4:
                    playlist.printPlaylist();
                    break;
                case 5:
                    iterator.remove();
                    break;
            }
        }


    }

    public static void printCurrentSong() {

    }
}