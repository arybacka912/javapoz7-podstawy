package hangman;

import java.util.Scanner;

import static tictactoe.TicTacToe.startGame;


public class HangmanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hangmanValue = new String[10];
        int index = 0;
        int decision;

        do {
            System.out.println("1. Start");
            System.out.println("2. Wyniki");
            System.out.println("0. koniec");
            decision = scanner.nextInt();
            scanner.nextLine();
            switch (decision){
                case 1:
                    startGame(scanner);

                    break;
                case 2:
                    showHighscores(scanner);

                    break;
            }
        } while (decision != 0);
    }
//    private static void startGame(Scanner scanner) {
//        System.out.println("Tutaj będzie logika gry");
//        Random random = new Random();
//        random.nextInt();
//    }

    private static void showHighscores(Scanner scanner) {
        System.out.println("Tutaj będzie wyświetlanie wyników");
    }

//    private static void bleble(Scanner scanner, String[] todos, int index) {
//        TodoViews.newTodoMessage();
//        String newTodo = scanner.nextLine();
//        todos[index] = newTodo;
//    }

    public static void newTodoMessage() {
        System.out.println("coś tam");
    }

}
