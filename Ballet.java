public class Ballet extends MusicalShow {
    private final Choreographer choreographer;

    public Ballet(String title, String librettoText, int duration, Director director, MusicAuthor musicAuthor,
                  Choreographer choreographer) {
        super(title, librettoText, duration, director, musicAuthor);
        this.choreographer = choreographer;
    }
}