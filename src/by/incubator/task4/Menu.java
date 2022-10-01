package by.incubator.task4;

public class Menu {

    private final Writer writer;
    private final Reader reader;

    public Menu() {
        this.reader = new Reader();
        this.writer = new Writer();
    }

    public void start() {
        while (true) {
            writer.print("Input number (day of the week)");
            writer.print("Input -1 for exit");
            int numberOfDay = reader.getInt();
            if (numberOfDay == -1) {
                return;
            }
            chooser(numberOfDay);
        }
    }

    private void chooser(int numberOfDay) {
        switch (numberOfDay) {
            case 1: {
                writer.printWeekDay(DaysOfWeek.MONDAY);
                break;
            }
            case 2: {
                writer.printWeekDay(DaysOfWeek.TUESDAY);
                break;
            }
            case 3: {
                writer.printWeekDay(DaysOfWeek.WEDNESDAY);
                break;
            }
            case 4: {
                writer.printWeekDay(DaysOfWeek.THURSDAY);
                break;
            }
            case 5: {
                writer.printWeekDay(DaysOfWeek.FRIDAY);
                break;
            }
            case 6: {
                writer.printWeekDay(DaysOfWeek.SATURDAY);
                break;
            }
            case 7: {
                writer.printWeekDay(DaysOfWeek.SUNDAY);
                break;
            }
            default: {
                writer.print(numberOfDay);
            }
        }
    }
}
