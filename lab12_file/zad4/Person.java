package zad4;

public class Person {
    public String firstName;
    public String lastName;
    public int birthYear;

    @Override
    public String toString() {
        return
                firstName +
                " " + lastName +
                " birthYear= " + birthYear;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
}
