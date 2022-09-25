package by.incubator.task4;

import java.util.Scanner;

public class Reader {

    private final Scanner scanner;
    private final Writer writer;

    public Reader() {
        this.writer = new Writer();
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {
        while (!scanner.hasNextInt()) {
            writer.print("You entered the wrong type of value");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
