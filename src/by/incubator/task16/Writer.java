package by.incubator.task16;

import java.lang.reflect.Array;
import java.util.List;

public class Writer {

    public static <T> void println(T text) {
        System.out.println(text);
    }

    public static <T> void print(T text) {
        System.out.print(text);
    }

    public static <T> void printList(List<T> list) {
        for (T t : list) {
            Writer.print(t + ", ");
        }
        Writer.println("");
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            Writer.print(t + ", ");
        }
        Writer.println("");
    }
}
