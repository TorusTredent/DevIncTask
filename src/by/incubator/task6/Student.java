package by.incubator.task6;

public class Student {

    private static int numberOfStudents;
    private String firstName;
    private String lastName;
    private double gradePointAverage;

    public Student(String firstName, String lastName, double gradePointAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradePointAverage = gradePointAverage;
        numberOfStudents++;
        Writer.print("Default construct execution - " + numberOfStudents);
    }

    public static void displayNumberOfStudents() {
        Writer.print(numberOfStudents);
    }

    @Override
    public String toString() {
        return  firstName + ", " + lastName + ", '" + gradePointAverage + "'";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }
}
