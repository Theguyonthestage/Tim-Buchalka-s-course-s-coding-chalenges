import java.util.ArrayList;

public class Album {
    private String albumName;
    ArrayList<Song> album;

    public Album(String albumName) {
        this.albumName = albumName;
        this.album = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Song> album) {
        this.album = album;
    }

    public void addSongToAlbum(String songTitle, float duration) {
        Song newSong = new Song(songTitle, duration);
        if (findSong(songTitle) == null) {
            album.add(newSong);
        }
    }

    public Song findSong(String songTitle) {
        for (Song temp : album) {
            if (temp.getTitle().equals(songTitle)) {
                return temp;
            }
        }
        return null;
    }
}