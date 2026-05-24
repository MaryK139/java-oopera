public class Person {
    private final String name;
    private final String surname;
    private final PersonGender gender;

    public Person(String name, String surname, PersonGender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public enum PersonGender {
        MALE,
        FEMALE
    } // enum - перечесление
}