public class Opera extends  MusicalShow {
    private final int choirSize;

    public Opera(String title, String librettoText, int duration, int choirSize, Director director,
                 MusicAuthor musicAuthor) {
        super(title, librettoText, duration, director, musicAuthor);
        this.choirSize = choirSize;
    }
}