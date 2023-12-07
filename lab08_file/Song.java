import java.util.Comparator;
public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "[ " + title + " " +artist+" "+ duration + " ]";
    }
}
class SongComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        int durationComparison = Integer.compare(song1.duration, song2.duration);
        if (durationComparison != 0) {
            return durationComparison;
        }
        return song1.title.compareTo(song2.title);
    }
}
