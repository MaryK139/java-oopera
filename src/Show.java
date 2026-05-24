import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration; // общая продолжительность в минутах
    private final Director director;
    private final ArrayList<Actor> actors = new ArrayList<>();

    public String getTitle() {
        return title;
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
}
