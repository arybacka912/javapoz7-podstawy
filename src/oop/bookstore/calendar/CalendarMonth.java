package oop.bookstore.calendar;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarMonth {
    private static final char[] weekDaysShortcuts = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};

    public static CalendarMonth currentMonth() {
//        LocalDate now = LocalDate.now();
        return CalendarMonth.ofLocalDate(LocalDate.now());
    }

    public static CalendarMonth ofMonth(int year, int month) {
//        LocalDate date = LocalDate.of(year, month, 1);
        return CalendarMonth.ofLocalDate(LocalDate.of(year, month, 1));
    }

    public static CalendarMonth ofLocalDate(LocalDate date) {
        String monthName = date.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault());
        int year = date.getYear();
        int month = date.getMonth().getValue();
        int numberOfDays = date.lengthOfMonth();
        int startingWeekDay = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        return CalendarMonth.of(monthName, year, month, numberOfDays, startingWeekDay);
    }

    public static CalendarMonth of(String name, int year, int month, int numberOfDays, int startingWeekDay) {
        CalendarMonth calendarMonth = new CalendarMonth(name);
        calendarMonth.startingWeekDay = startingWeekDay;
        calendarMonth.days = createCalendarDays(year, month, numberOfDays);
        calendarMonth.year = year;
        calendarMonth.month = month;
        return calendarMonth;
    }

    private static CalendarDays[] createCalendarDays(int year, int month, int numberOfDays) {
        CalendarDays[] days = new CalendarDays[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            days[i] = new CalendarDays(year, month, i + 1);
        }
        return days;
    }

    private final String name;
    private CalendarDays[] days;
    private int startingWeekDay;
    private int year;
    private int month;

    public CalendarMonth(String name) {
        this.name = name;
    }

    public CalendarMonth(String name, CalendarDays[] days, int startingWeekDay) {
        this.name = name;
        this.days = days;
        this.startingWeekDay = startingWeekDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public CalendarDays getCalendarDay(int dayNumber) {
        return days[dayNumber - 1];
    }

    public String getName() {
        return name;
    }

    public CalendarDays[] getDays() {
        return days;
    }

    public void setDays(CalendarDays[] days) {
        this.days = days;
    }

    public int getStartingWeekDay() {
        return startingWeekDay;
    }

    public void setStartingWeekDay(int startingWeekDay) {
        this.startingWeekDay = startingWeekDay;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name.toUpperCase()).append("\n");
        appendHorizontalLine(builder);
        for (int i = 0; i < weekDaysShortcuts.length; i++) {
            builder.append(weekDaysShortcuts[i]).append("   ");
        }
        builder.append("\n");
        appendHorizontalLine(builder);

        for (int i = 0; i < startingWeekDay - 1; i++) {
            builder.append("    ");
        }
        for (int i = 0 ; i < days.length; i++) {
            if ((i + startingWeekDay - 1) % 7 == 0) {
                builder.append("\n");
            }
            builder.append(createCalendarDayElement(days[i]));
        }
        builder.append("\n");
        appendHorizontalLine(builder);
        return builder.toString();
    }

    private void appendHorizontalLine(StringBuilder builder) {
        for (int i = 0; i < 7 * 4; i++) {
            builder.append("-");
        }
        builder.append("\n");
    }

    private String createCalendarDayElement(CalendarDays calendarDay) {
        String calendarDayRepresentation = "" + calendarDay.getDay();
        calendarDayRepresentation += calendarDay.hasNote() ? "*" : " ";
        calendarDayRepresentation += calendarDay.getDay() >= 10 ? " " : "  ";
        return calendarDayRepresentation;
    }

    public void setNoteForDay(String note, int dayNumber) {
        days[dayNumber - 1].setNotes(note);
    }

    //tablica z dniami
    //nazwa miesiaca
    //startingWeekDay
}