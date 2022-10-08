package by.incubator.task11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] persons = initPersons();
        Writer.print("Sorting by name comparable: ");
        Sorter.sortArrayByNameComparable(persons);
        Writer.printArray(persons);
        Writer.print("Sorting by age comparator: ");
        Sorter.sortArrayByAgeComparator(persons);
        Writer.printArray(persons);
        Writer.print("Sorting by name comparable: ");
        Sorter.sortArrayByNameComparable(persons);
        Writer.printArray(persons);
    }


    private static Person[] initPersons() {
        return new Person[]{
                new Person("Pahan", 21),
                new Person("Lisa", 22),
                new Person("Petya", 12),
                new Person("Baba-Yagaa", 112),
                new Person("Leshyj", 321),
                new Person("Leha", 2),
                new Person("Vera", 19)
        };
    }
}
