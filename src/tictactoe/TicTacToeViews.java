package tictactoe;

import java.util.Scanner;

public class TicTacToeViews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            TicTacToe.menuView();
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
            }
        } while (answer != 0);
    }

    public static void startGame(Scanner scanner) {
        boolean result = true;
        char cross = 'X';
        char circle = 'O';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i = 0;
        do {
            TicTacToe.boardView(board);
            int position = askForposition(scanner, board);
            mark(currentSign, board, position);
            currentSign = currentSign == 'X' ? circle : cross;
            i++;
        } while (i < 9 && !gameFinished(board));
        System.out.println("End of game");
    }

    private static void mark(char currentSign, char[] board, int position) {
        board[position] = currentSign;
    }

    private static boolean gameFinished(char[] board) {
        // wrzucić tutaj i <9, i sprawdzić czy jest remis
//        return isFirstDiagonalEqual(board) || isSecondDiagonalEqual(board) || isAnyVerticalEqual(board) || isAnyHorizontalEqual(board);
//    }
        return false;
    }

    public static int askForposition(Scanner scanner, char[] board) {
        int position;
        do {
            position = scanner.nextInt();
            if (!isValidPosition(position, board)) {
                System.out.println("Invalid value. Try again");
            }
        } while (!isValidPosition(position, board));
        return position - 1;
    }

    private static boolean isValidPosition(int position, char[] board) {
        return position >= 1 && position <= 9 && board[position - 1] != 'X' && board[position - 1] != 'O';

    }
}