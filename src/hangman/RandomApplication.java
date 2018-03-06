package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomApplication {
    public static void randomExample() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//            ThreadLocalRandom.current().nextInt();
            System.out.println(random.nextInt((10) + 10));

        }
    }



    public static void main(String[] args) {
        // 2. nowa tablica n elemetnowa zlożona z losowych liczb
        // 3. nowa tablica o wielkości zdefiniowanej przez Usera elementowa złożona z losowych liczb z zakresu podanego przez usera
        //4. suma losowych elementów
        //5. metoda symulująca rzut kostką do gry (zwracanie wartości)


//      zadanie 1.  int[] array = randomArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + ". " + array[i]);
//        }

//        zadanie 2
        randomArrayFromUser();
        // zad
        randomArrayOfEvenNumbers();
    }

    // 1. nowa tablica n elemetnowa zlożona z losowych liczb
    public static int[] randomArray() {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10 + 5);

        }
        return array;
    }

    // 2. nowa tablica n elemetnowa zlożona z losowych liczb
    public static int[] randomArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify size");
        int size = scanner.nextInt();
        System.out.println("Specify bound");
        int bound = scanner.nextInt();
        System.out.println("Specify offset");
        int offset = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(bound) + offset;
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        return array;
    }
    // wygenerować 10 losowych liczb parzystych z zakresu 0 - 10 włącznie while 0-5 włącznie generujemy liczby i x2
    public static void randomArrayOfEvenNumbers () {
    // TODO napisać jeszcze raz generowanie liczb
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(6) * 2;
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] randomArray2() {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

        }
        return array;
    }

}
