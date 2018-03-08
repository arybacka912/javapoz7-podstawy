package oop.bookstore.calendar;
import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShowMonth[] showMonth = new ShowMonth[12];
        SwitchMonth[] switchMonth = new SwitchMonth[10];

        CalendarMonth calendarMonth = CalendarMonth.of("March", 2018, 3, 31, 4);
        int decision;

        do {
            System.out.println("1. Show Month");
            System.out.println("2. Switch Month {month numberOfDays startingWeekDay}");
            System.out.println("0. End");
            decision = scanner.nextInt();
            scanner.nextLine();
            switch (decision){
                case 1:
                    showMonth(scanner, calendarMonth);

                    break;
                case 2:
                    switchMonth(scanner, switchMonth);

                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        } while (decision != 0);
    }
    public static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        System.out.println(calendarMonth);
        System.out.println("1.Add note, 2.Show note, 3. Remove note");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int dayNumber = scanner.nextInt();
                String note = scanner.nextLine();
                calendarMonth.setNoteForDay(note, dayNumber);
                break;
            case 2:

                break;
            default:
                break;
        }
        while (option != 3);

    }

    private static void switchMonth(Scanner scanner, SwitchMonth[] switchMonth) {





    }
      //  CalendarMonth marchMonth = CalendarMonth.of("March", 2018, 3, 31, 4);

      //  System.out.println(marchMonth);

//    int firstNumber = scanner.nextInt();
//    int secondNumber = scanner.nextInt();
//
//        System.out.println("firstNumber =" + firstNumber);
//                System.out.println("secondNumber =" + secondNumber);
    }




