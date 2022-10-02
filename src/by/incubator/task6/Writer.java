package by.incubator.task6;

public class Writer {

    public static <T> void print(T text) {
        System.out.println(text);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            print(t);
        }
    }

    public static void printDecimal(double number) {
        System.out.printf("%.2f%n", number);
    }
}
