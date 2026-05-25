import java.util.Objects;

public class MusicalShow extends Show {
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, String librettoText, int duration, Director director, MusicAuthor musicAuthor) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(MusicAuthor musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        if (librettoText != null) {
            System.out.println("Отрывок из спектакля " + getTitle() + ": " + librettoText);
        }
    }

    @Override
    public String toString() {
        return getTitle() + " (продолжительность " + getDuration() + " минут)\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() + "\nОтрывок из текста либретто: " + getLibrettoText();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MusicalShow musicalShow = (MusicalShow) o;
        return Objects.equals(getTitle(), musicalShow.getTitle()) &&
                Objects.equals(getDuration(), musicalShow.getDuration()) &&
                Objects.equals(getDirector(), musicalShow.getDirector()) &&
                Objects.equals(musicAuthor, musicalShow.musicAuthor) &&
                Objects.equals(librettoText, musicalShow.librettoText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDuration(), getDuration(), musicAuthor, librettoText);
    }
}
