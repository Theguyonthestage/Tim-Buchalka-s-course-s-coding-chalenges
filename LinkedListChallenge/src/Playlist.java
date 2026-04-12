import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    LinkedList<Song> playlist = new LinkedList<>();
    ArrayList<Album> albums = new ArrayList<>();
//    ListIterator<Song> iterator = playlist.listIterator();



    public Song findSongInAlbum (String songTitle, String albumName ){
        Album existingAlbum = findAlbum(albumName);
        if (existingAlbum!=null){
            return existingAlbum.findSong(songTitle);
        } return null;
    }

    public Album findAlbum (String albumTitle){
        for (Album temp : albums){
            if (temp.getAlbumName().equals(albumTitle)){
                return temp;
            }
        } return null;
    }

    public Playlist(ArrayList<Album> albums) {
        this.playlist = new LinkedList<>();
        this.albums = albums;
    }
    public void addSongToPlaylist(String songTitle, String albumName){
        Song song = findSongInAlbum(songTitle,albumName);

        if (song!=null){
            playlist.add(song);
        } else System.out.println("Song could not be found! Song was not added to playlist");
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public ListIterator<Song> getIterator() {
        return playlist.listIterator();
    }

    public void printPlaylist (){
        for (Song song : playlist){
            System.out.println(song.getTitle());
        }
    }

}

