package by.incubator.task18.console;

import by.incubator.task18.entity.Apple;

public class Writer {

    public static <T> void print(T text) {
        System.out.println(text);
    }

    public static <T> void printError(T text) {
        System.err.println(text);
    }

    public static void printApple(Apple apple) {
        print("Apple: " + apple.getWeight() + ", " + apple.getColor());
    }
}
