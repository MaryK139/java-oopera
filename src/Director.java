import java.util.Objects;

public class Director extends Person {
    private int numberOfShows;

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public Director (String name, String surname, int numberOfShows, PersonGender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", количество работ - " + numberOfShows;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Director director = (Director) o;
        return Objects.equals(getName(), director.getName()) &&
                Objects.equals(getSurname(), director.getSurname()) &&
                numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), numberOfShows);
    }
}
