package by.incubator.task16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
    private static final List<People> peoples = Arrays.asList(new People("Basil", 16, Sex.MAN),
                                                            new People("Peter", 23, Sex.MAN),
                                                            new People("Helen", 42, Sex.WOMEN),
                                                            new People("Ivan", 69, Sex.MAN));

    public static void main(String[] args) {
        completedTaskA();
        completedTaskB();
    }

    private static void completedTaskB() {
        printMenWhoLiableForMilitary();
        printAverageAgeAmongMen();
        printNumberOfPotentially();
        printPersonWithMinAge();
        printSortingListByGenderAndAge();
    }

    private static void printSortingListByGenderAndAge() {
        Writer.printList(peoples.stream()
                .sorted(Comparator.comparing(People::getSex))
                .collect(Collectors.toList()));
        Writer.printList(peoples.stream()
                .sorted(Comparator.comparing(People::getAge))
                .collect(Collectors.toList()));
    }

    private static void printPersonWithMinAge() {
        People age = peoples.stream()
                .min(Comparator.comparingDouble(People::getAge))
                .get();
        Writer.println(age);
    }

    private static void printNumberOfPotentially() {
        long count = peoples.stream()
                .filter(x -> x.getAge() >= 18 && x.getAge() < 60)
                .filter(x -> {return x.getSex() != Sex.WOMEN || x.getAge() < 55;})
                .count();
        Writer.println(count);
    }

    private static void printAverageAgeAmongMen() {
        double average = peoples.stream()
                .filter(x -> x.getSex() == Sex.MAN)
                .mapToDouble(people -> people.getAge())
                .average()
                .getAsDouble();
        Writer.println(average);
    }

    private static void printMenWhoLiableForMilitary() {
        List<People> military = peoples.stream()
                .filter(x -> x.getAge() >= 18 && x.getAge() <= 27)
                .collect(Collectors.toList());
        Writer.printList(military);
    }


    private static void completedTaskA() {
        printCountOfA1Element();
        printFirstElem();
        printThirdElem();
        printTwoElemFromTheSec();
        printAllByTemplate();
        printIfExistElement();
        printIfNotExistElem();
        printArrayNumber();
        printOneRow();
        printSortingList();
    }

    private static void printSortingList() {
        List<String> sortList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        Writer.printList(sortList);
    }

    private static void printOneRow() {
        String row = list
                .stream()
                .reduce((accumulator, element) -> accumulator + element)
                .get();
        Writer.println(row);
    }

    private static void printArrayNumber() {
        Integer[] array = list.stream()
                .map(element -> Integer.parseInt(element.substring(1)))
                .toArray(Integer[]::new);
        Writer.printArray(array);
    }

    private static void printIfNotExistElem() {
        boolean find = list.stream()
                .noneMatch(x -> x.equals("a7"));
        Writer.println(find);
    }

    private static void printIfExistElement() {
        boolean find = list.stream()
                .anyMatch(x -> x.equals("a1"));
        Writer.println(find);
    }

    private static void printAllByTemplate() {
        List<String> allByTemplate = list.stream()
                .filter(x -> x.equals("a1"))
                .collect(Collectors.toList());
        Writer.printList(allByTemplate);
    }

    private static void printCountOfA1Element() {
        long countOfA1 = list.stream()
                .filter(x -> x.equals("a1"))
                .count();
        Writer.println(countOfA1);
    }

    private static void printFirstElem() {
        String firstElement = list.stream()
                .findFirst().orElse("0");
        Writer.println(firstElement);
    }

    private static void printThirdElem() {
        String thirdElement = list.stream()
                .skip(2)
                .findFirst().orElse("0");
        Writer.println(thirdElement);
    }

    private static void printTwoElemFromTheSec() {
        List<String> twoElemFromTheSec = list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        Writer.printList(twoElemFromTheSec);
    }
}
