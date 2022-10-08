package by.incubator.task11;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter {

    public static void sortArrayByAgeComparator(Person[] persons) {
        Arrays.sort(persons, new PersonComparator());
    }

    public static void sortArrayByNameComparable(Person[] persons) {
        Arrays.sort(persons);
    }

    public static void sortArrayByNameComparator(Person[] persons) {
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
