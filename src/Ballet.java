import java.util.Objects;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Choreographer getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Choreographer choreographer) {
        this.choreographer = choreographer;
    }

    public Ballet(String title, String librettoText, int duration, Director director, MusicAuthor musicAuthor,
                  Choreographer choreographer) {
        super(title, librettoText, duration, director, musicAuthor);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return getTitle() + " (продолжительность " + getDuration() + " минут)\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() + "\nХореограф: " + choreographer +
                "\nОтрывок из текста либретто: " + getLibrettoText();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ballet ballet = (Ballet) o;
        return Objects.equals(getTitle(), ballet.getTitle()) &&
                Objects.equals(getDuration(), ballet.getDuration()) &&
                Objects.equals(getDirector(), ballet.getDirector()) &&
                Objects.equals(getMusicAuthor(), ballet.getMusicAuthor()) &&
                Objects.equals(getLibrettoText(), ballet.getLibrettoText()) &&
                Objects.equals(choreographer, ballet.choreographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDuration(), getDirector(), getMusicAuthor(),
                getLibrettoText(), choreographer);
    }
}
