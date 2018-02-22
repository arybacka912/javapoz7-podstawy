package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        exampleWhile();

    }

    private static void exampleWhile() {
        Scanner scanner = new Scanner(System.in);
        int sum = 10;
        int tmp = 0;
        int i = 0;
        // warunek trwania pętli
        while (tmp < sum) {

            int value = scanner.nextInt();
            i++;
            tmp += value;
        }
        System.out.println("Inserted " + " " + i + "numbers");

        System.out.println("zadanie 1");
        //wczytujemy liczby tak długo, aż nie będzie ona podzielna przez 15
        Scanner reader = new Scanner(System.in);
        int number = 1;
        while ((number % 15) != 0) {
            number = reader.nextInt();
              }
        System.out.println("Number " + number);

    // wczytujemy liczby tak długo , aż ktoś nie poda 0. Wyświetlamy sumę podanych elementów
    boolean result = true;
    int sum1 = 0;
    while (result) {
        int value = reader.nextInt();
        sum1 += value;
        if (value == 0) {
            result = false;
        }
        // || result = value != 0;
    }
        System.out.println("Sum= " + sum1);
    }
}
