package by.incubator.task13.console;

import by.incubator.task13.console.Writer;

import java.util.Scanner;

public class Reader {

    private static final Scanner scanner = new Scanner(System.in);

    public static Integer getInt() {
        while (!scanner.hasNextInt()) {
            Writer.print("You entered the wrong type of value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int getWarriors() {
        int a;
        do {
            while (!scanner.hasNextInt()) {
                Writer.print("You entered the wrong type of value");
                scanner.next();
            }
            a = scanner.nextInt();
            if (a == 1) {
                Writer.print("there must be more than 1 warriors");
            }
        } while (a <= 1);
        return a;
    }

    public static int getKillInterval() {
        int a;
        do {
            while (!scanner.hasNextInt()) {
                Writer.print("You entered the wrong type of value");
                scanner.next();
            }
            a = scanner.nextInt();
            if (a == 0) {
                Writer.print("there must be more than 0 interval");
            }
        } while (a <= 0);
        return a;
    }
}
