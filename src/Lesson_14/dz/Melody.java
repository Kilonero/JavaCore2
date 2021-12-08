package Lesson_14.dz;

public class Melody {
    private String artist;
    private String composition;

    Melody(String artist, String composition) {
        this.artist = artist;
        this.composition = composition;
    }

    public Melody() {

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Melody{" +
                "artist='" + artist + '\'' +
                ", composition='" + composition + '\'' +
                '}';
    }
}
