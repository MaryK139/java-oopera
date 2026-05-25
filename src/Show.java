import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration; // общая продолжительность в минутах
    private Director director;
    private ArrayList<Actor> actors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля:");
        if (actors.isEmpty()) {
            System.out.println("В спектакле пока нет актёров.");
            return;
        }
        for (Actor actor : actors) {
            System.out.println(actor); // Вызываем наш переопределённый метод
        }
    }

    public void addActor(Actor actor) {
        if (!actors.contains(actor)) {
            actors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        if (oldSurname == null) {
            System.out.println("Ошибка: фамилия не может быть null!");
            return;
        }
        int index = -1;
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getSurname().equals(oldSurname)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Актёр с фамилией " + oldSurname + " не найден!");
            return;
        }
        actors.set(index, newActor);
        System.out.println("Актёр " + oldSurname + " успешно заменён на " + newActor);
    }

    @Override
    public String toString() {
        return title + " (продолжительность " + duration + " минут)\nРежиссер: " + director +
                "\nСостав актеров: " + actors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration &&
                Objects.equals(title, show.title) &&
                Objects.equals(director, show.director) &&
                Objects.equals(actors, show.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, director, actors);
    }
}
