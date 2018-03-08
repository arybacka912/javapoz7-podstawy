package oop.bookstore;

import java.util.Scanner;
//zad. dom
// todos obiektowy : status, name, object :year, name, owner(dodatkowa class) zdefiniować żeby wszystko się skąpilowało (jakie pola wymagane kiedy set kiedy get?

public class ApplicationBookStore {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Author[] authors = new Author[5];
                Book[] books = new Book[10];
                int index = 0;
                int decision;

                do {
                    System.out.println("1. Authors");
                    System.out.println("2. Books");
                    System.out.println("0. Exit");
                    decision = scanner.nextInt();
                    scanner.nextLine();
                    switch (decision){
                        case 1:
                            authorsList(scanner, authors);

                            break;
                        case 2:
                            booksList(scanner, books);

                            break;
                    }
                } while (decision != 0);
            }

            public static void authorsList(Scanner scanner, Author[] authors) {
                list(authors);
                scanner.nextLine();
            }
        private static void booksList(Scanner scanner, Book[] books) {
        list(books);
        scanner.nextLine();

    }
    private static void list(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
        }

