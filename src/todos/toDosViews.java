//package todos;
//
//import java.util.Scanner;
//
//public class toDosViews {
//
//    public static void startGame(Scanner scanner) {
//        char add = '1';
//        char load = '2';
//        char theEnd = '0';
//        char currentSign = boardView() ;
//        char[] board = "10".toCharArray();
//        int i = 1;
//        do {
//            toDos.boardView(board);
//            int position = askForposition(scanner, board);
//            mark(currentSign, board, position);
//            currentSign = currentSign == 'X' ? add : load;
//            i++;
//        } while (i < 9 && !gameFinished(board));
//        TicTacToeViews.boardView(board);
//        System.out.println("End of game");
//        if(!gameFinished(board)) {
//            System.out.println("Draw");
//        }else {
//            TicTacToeViews.loserEndGame;
//        }
//    }
//
//}
