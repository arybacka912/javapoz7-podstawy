package oop.bookstore.calendar;

import java.time.LocalDate;
import java.util.Arrays;

public class CalendarMonth {
    //tablica z dniami
    //nazwa miesiąca
    //startinWeekDay\
    private static final char[] weekDaysShortcuts = {'M', 'T', 'W', 'T', 'F', 'S', 'S'};

//    public static CalendarMonth currentMonth() {
//        LocalDate date = LocalDate.now();
//            int value = date.getDayOfWeek().getValue();
//            date.getMonth();
//
//        }


    public static CalendarMonth of(String name, int year, int month, int numberOfDays, int startingWeekDays) {
        CalendarMonth calendarMonth = new CalendarMonth(name);
        calendarMonth.startingWeekDays = startingWeekDays;
       // CalendarDays[] days = createCalendarDays(year, month, numberOfDays);
  //      calendarMonth.setDays(days);
        calendarMonth.days = createCalendarDays(year, month, numberOfDays);
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
    private int startingWeekDays;

    public CalendarMonth(String name) {
        this.name = name;
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

    public int getStartingWeekDays() {
        return startingWeekDays;
    }

    public void setStartingWeekDays(int startingWeekDays) {
        this.startingWeekDays = startingWeekDays;
    }

    public CalendarMonth(String name, CalendarDays[] days, int startingWeekDays) {
        this.name = name;
        this.days = days;
        this.startingWeekDays = startingWeekDays;
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

        for (int i = 0; i < startingWeekDays -1; i++) {
            builder.append("    ");
        }
        for (int i = 0; i <days.length; i++) {
            if((i + startingWeekDays -1 ) % 7 == 0 ){
                builder.append("\n");
            }
            builder.append(createCalendarDayElement(days[i]));

        }
        builder.append("\n");
        appendHorizontalLine(builder);
        return builder.append("\n").toString();
    }

    private void appendHorizontalLine(StringBuilder builder) {
        for (int i = 0; i < 7 * 4; i++) {
            builder.append("-");
        }
        builder.append("\n");
    }

    private String createCalendarDayElement(CalendarDays calendarDays) {
        String calendarDayRepresentation = "" + calendarDays.getDay();
        calendarDayRepresentation += calendarDays.hasNote() ? "*" : " ";
        calendarDayRepresentation += calendarDays.getDay() >= 10 ? " " : "  ";
        return calendarDayRepresentation;
    }

    public void setNoteForDay(String note, int dayNumber) {
        days[dayNumber - 1].setNotes(note);
    }
}
