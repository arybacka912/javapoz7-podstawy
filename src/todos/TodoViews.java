package todos;

import java.util.Scanner;

public class TodoViews {
    public static void menu() {
        System.out.println("1. dodaj");
        System.out.println("2. wczytaj");
        System.out.println("0. koniec");
    }

    public static void noSpaceWarningMessage() {
        System.out.println("No space for new todo");
        System.out.println();
        System.out.println();
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println("Press any key to continue");
        scanner.nextLine();
    }

    public static void newTodoMessage() {
        System.out.println("-----------------");
        System.out.println("- Add next todo -");
        System.out.println("-----------------");
    }

    public static void noTOdosToDisplayMessage() {
        System.out.println("-----------------------");
        System.out.println("- No todos to display -");
        System.out.println("-----------------------");
    }
}
