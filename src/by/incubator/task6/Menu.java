package by.incubator.task6;

import java.util.Arrays;

public class Menu {

    public void start() {
        Writer.print("Input array size: ");
        int arraySize = Reader.getInt();
        Student[] students = Reader.getStudents(arraySize);
        double averageScore = calcAverageScore(students);
        Writer.printDecimal(averageScore);
        Student[] studentsWithLowerAver = getStudentsWithALowerThanAverageScore(students, averageScore);
        Writer.printArray(studentsWithLowerAver);
    }

    private double calcAverageScore(Student[] students) {
        double sumOfGradePoints = 0;
        for (Student student : students) {
            sumOfGradePoints += student.getGradePointAverage();
        }
        return sumOfGradePoints / students.length;
    }

    private Student[] getStudentsWithALowerThanAverageScore(Student[] students, double averageScore) {
        return Arrays.stream(students)
                .filter(x -> x.getGradePointAverage() < averageScore)
                .toArray(Student[]::new);
    }
}
