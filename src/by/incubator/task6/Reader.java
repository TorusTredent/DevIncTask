package by.incubator.task6;

import java.util.Scanner;

public class Reader {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        while (!scanner.hasNextInt()) {
            Writer.print("You entered the wrong type of value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String getString() {
        while (!scanner.hasNext()) {
            System.out.println("Вы ввели значение не того типа");
            scanner.next();
        }
        String  str =  scanner.next();
        return str;
    }

    public static double getDouble() {
        while (!scanner.hasNextDouble()) {
            Writer.print("You entered the wrong type of value");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static Student[] getStudents(int arraySize) {
        Student[] students = new Student[arraySize];
        for (int i = 0; i < arraySize; i++) {
            students[i] = getStudent();
        }
        return students;
    }

    public static Student getStudent() {
        Writer.print("Input first name: ");
        String firstName = getString();
        Writer.print("Input last name: ");
        String lastName = getString();
        Writer.print("Input grade point average: ");
        double gradePointAverage = getDouble();
        return new Student(firstName, lastName, gradePointAverage);
    }
}
