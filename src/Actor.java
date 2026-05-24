import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, int height, PersonGender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actors = (Actor) o;
        return Objects.equals(getName(), actors.getName()) &&
                Objects.equals(getSurname(), actors.getSurname()) &&
                height == actors.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
