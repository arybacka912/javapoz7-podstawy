package todos;

import java.util.Scanner;

public class TodoApplication {

/*
TO DO
1. dodaj
2. Wczytaj
0. Koniec

Tablica [10] - 10-elementowa
MENU(1,2,0)
Kliknij 1 - prosisz użytkownika o dodanie " to do ": Dodaj "to do ", naciśnij enter i powróć do menu
Kliknij 2 - Wczytaj wszystkie elementy, które użytkownik dodał : 1. ble ble ble, 2. cos cos cos itd ... [ Scanner.nextline(); ]
kliknij 0 - KONIEC

1 i 2 pętla for !!!

 */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] todos = new String[10];
            int index = 0;
            int decision;

            do {
                TodoViews.menu();
                decision = scanner.nextInt();
                scanner.nextLine();
                switch (decision) {
                    case 1:
                        if ( index == todos.length) {
                            TodoViews.noSpaceWarningMessage();
                            TodoViews.waitForUser(scanner);
                        }else{
                            addTodo(scanner, todos, index);
                            index++;
                        }
                        addTodo(scanner, todos, index);
                        index++;
                        break;
                    case 2:
                        listTodos(todos, index);
                        TodoViews.waitForUser(scanner);
                        break;
                }
            } while (decision != 0);
        }

        private static void addTodo(Scanner scanner, String[] todos, int index) {
            TodoViews.newTodoMessage();
            String newTodo = scanner.nextLine();
            todos[index] = newTodo;
        }


        private static void listTodos( String[] todos, int todosToDisplay) {
//wyświetlanie tablicy
            //wyznaczenie zmiennej
            if (todosToDisplay == 0) {
                TodoViews.noTOdosToDisplayMessage();
            }
            for (int i = 0; i <todos.length ; i++) {
                System.out.println(i + ". " + todos[i]);

            }

        }
    }


