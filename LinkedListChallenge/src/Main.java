import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Album rockAlbum = new Album("Rock Classics");
        Album popAlbum = new Album("Pop Hits");

        // Add songs to albums
        rockAlbum.addSongToAlbum("Bohemian Rhapsody", 5.55f);
        rockAlbum.addSongToAlbum("Hotel California", 6.30f);
        rockAlbum.addSongToAlbum("Stairway to Heaven", 8.02f);

        popAlbum.addSongToAlbum("Billie Jean", 4.54f);
        popAlbum.addSongToAlbum("Shape of You", 3.53f);
        popAlbum.addSongToAlbum("Blinding Lights", 3.20f);

        // Create album list and add albums
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(rockAlbum);
        albums.add(popAlbum);

        // Create playlist
        Playlist playlist = new Playlist(albums);

        // Add songs to playlist
        playlist.addSongToPlaylist("Bohemian Rhapsody", "Rock Classics");
        playlist.addSongToPlaylist("Billie Jean", "Pop Hits");
        playlist.addSongToPlaylist("Stairway to Heaven", "Rock Classics");
        playlist.addSongToPlaylist("Blinding Lights", "Pop Hits");

        // Create utility and play
        Utility utility = new Utility(playlist);
        utility.play();


    }


    public static int printMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 - Quit\n" +
                "1 - Next song\n" +
                "2 - Previous song\n" +
                "3 - Replay current song\n" +
                "4 - List all songs\n" +
                "5 - Remove current song\n");
        return scanner.nextInt();


    }
}
