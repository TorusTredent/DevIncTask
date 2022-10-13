package by.incubator.task12;

import by.incubator.task12.console.Reader;
import by.incubator.task12.console.Writer;

public class Main {

    public static void main(String[] args) {
        String text = Reader.getString();
        boolean check = Checker.checkForBalanceBrackets(text);
        Writer.print(check);
    }
}
