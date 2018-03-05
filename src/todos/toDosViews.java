//package todos;
//
//
//public class toDosViews {
//
//
//    public static void main(String[] args) {
//        char[] board = boardView(scanner.next.in);
//        boardView(board);
//        board[10] = '1';
//        boardView(board);
//    }
//
//
//        public static void menuView() {
//            System.out.println("1. dodaj");
//            System.out.println("2. wczytaj");
//            System.out.println("0. koniec");
//        }
//    }

//    public static void startGame(Scanner scanner) {
//        char add = '1';
//        char load = '2';
//        char theEnd = '0';
//        char currentSign = boardView();
//        char[] board = "120".toCharArray();
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
//        if (!gameFinished(board)) {
//            System.out.println("Draw");
//        } else {
//            toDos.loserEndGame;
//        }
//    }
//}
