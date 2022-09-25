package by.incubator.task4;

public enum DaysOfWeek {

    MONDAY("MON", false),
    TUESDAY("TUE", false),
    WEDNESDAY("WED", false),
    THURSDAY("THU", false),
    FRIDAY("FRI", false),
    SATURDAY("SAT", true),
    SUNDAY("SUN", true);


    private String abbrev;

    private boolean isWeekend;


    DaysOfWeek(String abbrev, boolean isWeekend) {
        this.abbrev = abbrev;
        this.isWeekend = isWeekend;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
