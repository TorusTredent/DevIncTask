package by.incubator.task11;

public class Writer {

    public static <T> void print(T text) {
        System.out.println(text);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
