public class Director extends Person {
    private final int numberOfShows;

    public Director (String name, String surname, int numberOfShows, PersonGender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + getName() + " " + getSurname();
    }
}