package by.incubator.task3;

import java.util.Scanner;

public class Reader {

    private Scanner scanner = new Scanner(System.in);
    private final TextEditor textEditor;
    private final Writer writer;

    public Reader() {
        textEditor = new TextEditor();
        writer = new Writer();
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        writer.print("Input array size");
        while (!scanner.hasNextInt()) {
            writer.print("You entered the wrong type of value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public String[] readStringArray() {
        String[] arrayString = new String[readInt()];
        writer.print("Input words: ");
        readString();                   //if you do not use this line, then after entering
                                        // the size of the array, it will immediately enter the loop
                                        // and considers the field as zero, and after that it will already
                                        // read our values (scanner problem)
        for (int i = 0; i < arrayString.length; i++) {
            if (scanner.hasNextLine()) {
                String word = readString();
                arrayString[i] = word.equals("") ? null : word;
            }
        }
        return textEditor.replaceNull(arrayString);
    }
}
