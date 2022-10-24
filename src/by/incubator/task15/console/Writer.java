package by.incubator.task15.console;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Writer {

    public static <T> void println(T text) {
        System.out.println(text);
    }

    public static <T> void print(T text) {
        System.out.print(text);
    }

    public static void printArray(Integer[] numbers) {
        Arrays.stream(numbers)
                .map(number -> number + ", ")
                .forEach(Writer::print);
    }

    public static void printResultOfPredicate(Predicate<Integer> predicate, int number) {
        Writer.println(number + " - is even? " + predicate.test(number));
    }

    public static void printRandomName(List<String> names, Supplier<Integer> supplier) {
        Writer.println(names.get(supplier.get()));
    }
}
