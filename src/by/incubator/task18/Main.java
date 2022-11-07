package by.incubator.task18;

import by.incubator.task18.entity.Apple;
import by.incubator.task18.initializer.BadInitializer;
import by.incubator.task18.initializer.Initializer;
import by.incubator.task18.initializer.ObjectFactory;

import static by.incubator.task18.console.Writer.printApple;

public class Main {

    public static void main(String[] args) {
        Apple apple = createApple();
        printApple(apple);

        initializeApple(apple);
        printApple(apple);

        badInitializeApple(apple);
        printApple(apple);
    }


    private static Apple createApple() {
        return ObjectFactory.create(Apple.class);
    }

    private static void initializeApple(Apple apple) {
        Initializer.initialize(apple, "color", "red");
        Initializer.initialize(apple, "weight", 1.2);
    }

    private static void badInitializeApple(Apple apple) {
        BadInitializer.initialize(apple, "color", "yellow");
        BadInitializer.initialize(apple, "weight", 1.5);
    }
}
