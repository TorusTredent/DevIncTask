package by.incubator.task12.console;

import java.util.Scanner;

public class Reader {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        while (!scanner.hasNext()) {
            System.out.println("Вы ввели значение не того типа");
            scanner.next();
        }
        return scanner.next();
    }
}
