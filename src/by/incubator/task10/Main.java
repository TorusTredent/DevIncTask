package by.incubator.task10;

import by.incubator.task10.console.Writer;
import by.incubator.task10.constant.PathConstant;
import by.incubator.task10.exception.EmptyFileException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            readFile(PathConstant.INCORRECT_FILE_PATH);
        } catch (EmptyFileException e) {
            e.printStackTrace();
        }
        try {
            readFile(PathConstant.FILE_PATH);
        } catch (EmptyFileException e) {
            e.printStackTrace();
        }
        try {
            readFile(PathConstant.EMPTY_FILE_PATH);
        } catch (EmptyFileException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String path) throws EmptyFileException {
        File file = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream (file);
             Scanner scanner = new Scanner(fileInputStream)) {
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s'%n", fileLine, path);
        } catch (FileNotFoundException e) {
            throw new EmptyFileException("File not found on: ", path);
        } catch (IOException | NoSuchElementException e) {
            throw new EmptyFileException("Empty file on path: '" + path, e, path);
        } finally {
            Writer.print("finally method for '" + path + "'");
        }
    }
}
