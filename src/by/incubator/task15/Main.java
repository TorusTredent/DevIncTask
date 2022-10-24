package by.incubator.task15;

import by.incubator.task15.console.Writer;
import by.incubator.task15.entity.Cat;
import by.incubator.task15.entity.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Integer[] numbers = initArray();
        List<String> names = initList();

        Filter<Integer> numberFilter = number -> number >= 100;
        Predicate<Integer> numberPredicate = number -> number >= 100;
        Function<Integer, Integer> squareFunction = number -> number * number;
        Converter<Dog, Cat> dogToCatConverter = dog -> new Cat(dog.getName(), dog.getAge(), dog.getWeight());
        Predicate<Integer> predicateParity = number -> number % 2 == 0;
        Consumer<String> consumer = text -> Writer.println("Hello, " + text + "!");
        Supplier<Integer> supplier = () -> { return (int) (Math.random() * names.size()); };
        Function<String, Integer> stringToIntConverter = Integer::parseInt;
        UnaryOperator<Integer> unaryOperator = number -> number * number;

        Integer[] filteredArray = filterArray(numbers, numberFilter);
        Integer[] filteredArrayWithPredicate = filterArray(numbers, numberPredicate::test);
        Integer[] mappedArray = fill(numbers, squareFunction);

        Writer.printArray(numbers);
        Writer.println("___");
        Writer.printArray(filteredArray);
        Writer.println("___");
        Writer.printArray(filteredArrayWithPredicate);
        Writer.println("___");
        Writer.printArray(mappedArray);
        Writer.println("___");

        Dog dog = new Dog("Olivka", 1, 777);
        Cat cat = dogToCatConverter.convert(dog);
        Writer.println(cat);

        Writer.printResultOfPredicate(predicateParity, 1);
        Writer.printResultOfPredicate(predicateParity, 2);
        Writer.printResultOfPredicate(predicateParity, 3);

        greetings(consumer, "Olivka");
        Writer.printRandomName(names, supplier);
        printConvertedInt("10", stringToIntConverter);
        printSquareNumber(12, unaryOperator);
    }


    private static Integer[] initArray() {
        return new Integer[]{1,98,3,42,51,614,37,126,27};
    }

    private static List<String> initList() {
        List<String> list = new ArrayList<>();
        list.add("Elena");
        list.add("Alex");
        list.add("Jim");
        list.add("John");
        list.add("Sara");
        return list;
    }

    private static Integer[] filterArray(Integer[] numberArray, Filter<Integer> filter) {
        return Arrays.stream(numberArray)
                .filter(number -> filter(number, filter))
                .toArray(Integer[]::new);
    }

    private static <T> boolean filter(T arrayElement, Filter<T> filter) {
        return filter.apply(arrayElement);
    }

    private static Integer[] fill(Integer[] numberArray, Function<Integer, Integer> function) {
        return Arrays.stream(numberArray)
                .map(function)
                .toArray(Integer[]::new);
    }

    private static void greetings(Consumer<String> consumer, String name) {
        consumer.accept(name);
    }

    private static void printConvertedInt(String text, Function<String, Integer> stringToIntConverter) {
        Writer.println(convertString(text, stringToIntConverter));
    }

    private static void printSquareNumber(int number, UnaryOperator<Integer> unaryOperator) {
        Writer.println(squareNumber(number, unaryOperator));
    }

    private static int convertString(String text, Function<String, Integer> function) {
        return function.apply(text);
    }

    private static int squareNumber(int i, UnaryOperator<Integer> unaryOperator) {
        return unaryOperator.apply(i);
    }
}
