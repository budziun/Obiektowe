package zad4;

import java.util.Comparator;

public class BirthDateComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.birthYear,o2.birthYear);
    }
}
