public class MusicalShow extends Show {
    private final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, String librettoText, int duration, Director director, MusicAuthor musicAuthor) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText() {
        if (librettoText != null) {
            System.out.println("Отрывок из спектакля " + getTitle() + ": " + librettoText);
        }
    }
}
