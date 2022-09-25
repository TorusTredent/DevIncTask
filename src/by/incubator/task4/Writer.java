package by.incubator.task4;

public class Writer {
    public<T> void print(T obj) {
        System.out.println(obj);
    }

    public void printWeekDay(DaysOfWeek dayOfWeek) {
        if (dayOfWeek.isWeekend()) {
            System.out.println(dayOfWeek + " (" + dayOfWeek.getAbbrev() + ") is a weekend");
        } else {
            System.out.println(dayOfWeek + " (" + dayOfWeek.getAbbrev() + ") is not a weekend");
        }
    }
}
