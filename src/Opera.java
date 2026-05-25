import java.util.Objects;

public class Opera extends  MusicalShow {
    private int choirSize;

    public Opera(String title, String librettoText, int duration, int choirSize, Director director,
                 MusicAuthor musicAuthor) {
        super(title, librettoText, duration, director, musicAuthor);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return getTitle() + " (продолжительность " + getDuration() + " минут)\nРежиссер: " + getDirector() +
                "\nАвтор музыки: " + getMusicAuthor() + "\nКоличество людей в хоре: " + getChoirSize() +
                "\nОтрывок из текста либретто: " + getLibrettoText();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Opera opera = (Opera) o;
        return Objects.equals(getTitle(), opera.getTitle()) &&
                Objects.equals(getDuration(), opera.getDuration()) &&
                Objects.equals(getDirector(), opera.getDirector()) &&
                Objects.equals(getMusicAuthor(), opera.getMusicAuthor()) &&
                Objects.equals(getLibrettoText(), opera.getLibrettoText()) &&
                choirSize == opera.choirSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDuration(), getDirector(), getMusicAuthor(), getLibrettoText(), choirSize);
    }
}
