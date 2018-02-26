package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {

        String[] names = {"Jan", "Anna", "Marek"};
        for (int i = 0; i < names.length; i++) {

            System.out.println(names [i]);

        }
        //1. zdefiniować tablicę z kilkoma liczbami. obliczyć sumę
        int [] array = {1,2,3,4,5,6};
        int sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array [i];
        }
        System.out.println(sum);
        //2. zdefiniować tablicę z kilkoma liczbami. Obliczyć średnią
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array [i];
        }
        System.out.println(sum / array.length);
        //3. Zdefiniować tablicę z kilkoma liczbami. Obliczyć max i min
        int min = array [0];
        int max = array [0];
        for (int i = 1; i < array.length; i++) {
            if (array [i] < min) {
                min = array[i];
            }
            if (array [i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //4. Zdefiniować tablicę z kilkoma liczbami
        // zliczamy ilość elementów do wystąpienia liczby ujemnej
        int [] arrayWithValue = {1, 4, 6, 7, -4, 2};
        int counter = 0;

        while (counter < arrayWithValue.length && arrayWithValue[counter] >= 0) {
                counter++;
            }
        System.out.println("counter of positive numbers = " + counter);

        //5. podwoić wartości w tablicy
        int [] arrayToBeDoubled = {1,2,3,4,5,6};
        for (int i = 0; i < arrayToBeDoubled.length; i++) {
            arrayToBeDoubled[i] *= 2;
        }
        System.out.println(Arrays.toString(arrayToBeDoubled));

        //6. utworzyli tablicę n elementową z kolejnych liczb (np 4 1,2,3,4)
        int n = 4;
        int [] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(newArray));
        //7. utworzyć tablicę n elementową tylko z parzystych liczb (np 4 2,4,6,8)
        // zdefiniownae n z poprzedniego!
        int[] arrayOfEvenNumbers = new int [n];
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            arrayOfEvenNumbers[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(arrayOfEvenNumbers));
        //8. zapytać usera o rozmiar i utworzyć tablicę z liczbami (np 5 5,4,3,2,1 )
        int size = 5;
        int [] descendingNumbers = new int[size];
        for (int i = 0; i < size; i ++) {
            descendingNumbers [i] = descendingNumbers.length - i;
        }
        System.out.println(Arrays.toString(descendingNumbers));
        //9. zapytać usera o rozmiar i umożliwić mu wstawienie elementów i obliczyć średnią
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array");
        int sizeOfUserArray = scanner.nextInt();
        int[] userArray = new int [sizeOfUserArray];
        int sumOfUserArray = 0;
        for  (int i = 0; i < userArray.length; i++) {
            System.out.println("Insert next value");
            userArray[i] = scanner.nextInt();
            sumOfUserArray += userArray[i];
        }
        System.out.println("Avg = " + ((double)sumOfUserArray / userArray.length));
        //10. mamy posortowaną tablicę rosnąco. ile jest elementów mniejszych od liczby
        int searchingNumber = 6;
        int[] sortedArray = {1,3,5,6,7,8,9};
        int counterForSearching = 0;
        while (counterForSearching < sortedArray.length && sortedArray [counterForSearching] != 0) {
            counterForSearching++;
        }
        System.out.println(" We have " + counterForSearching + " numbers smaller than " + searchingNumber);

// zadanie domowe//
        //kodowanie i odkodowywanie szyfru cezara



        //tablica liczb. definiujecie liczbę np .3  ( 1,2,3,4,5,6) - dwie tablice 123 i 456
        //--> tworzymy 2 tablice z elementami odpowiednio mniejszymi i większymi



//        String massage = "Hello World";
//        char[] messageAsCharArray = message.toCharArray ();
//        int length = messageAsCharArray.length;
//        System.out.println(messageAsCharArray [0]);
//        System.out.println(messageAsCharArray [1]);
//        System.out.println(messageAsCharArray [2]);
//        System.out.println(messageAsCharArray [3]);

        long[] arrayLong = { 1,23,4,5,1000000000000L};
        char[] charArray = {'a', 'b'};
        String[] names1 = {"Jan" , "Anna"};
        //int [] array = {}; //tablice z 0 elementów
        // int [] array = {1,2,3,4,5,6}; tablica z 6 elementami
        int size1 = 10;
        int [] emptyArray = new int [10];
        int[] emptyArray2 = new int [size1];
        emptyArray [0] = 2;
                array[6] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }

        int number = 21;
        int multiplier = 1;
        int binaryCode = 0;
        while (number != 0) {
            int bit = number % 2;
            binaryCode += bit * multiplier;
            multiplier *= 10;
            number /= 2;
        }
        System.out.println(" binaryCode = " + binaryCode);
        char character = 'a' + 3;
        System.out.println(character);
        System.out.println((int) character);
        char a = (char) 97;
        System.out.println('c' + 1);
        for (int i= 0; i <= 122 - 97; i++) {
            System.out.println((char) (a + i));

        }
        System.out.println();

        for (int i=97; i <= 122; i++) {
            System.out.println((char) +i);
        }
        System.out.println();
        for(char i = 'a'; i <= 122; i++) {
            System.out.println(i);
        }

        char c = 'a' + 3;
        System.out.println(c);
        System.out.println((int) c);

//        System.out.println("binaryCode = " + binaryCode);
//        int number1 = 10101;
//        int multiplier1 = 0;
//        int binaryCode1 = 1;
//        while (number1 == 0) {
//            number
        }



    private static void value() {
        int number = 1500000000;
        System.out.println(number + number);
        long bigNumber = 3000000000L;
        System.out.println(bigNumber);
        System.out.println("MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Long.MIN_VALUE);

        System.out.println("Max Double = " + Double.MAX_VALUE);
        System.out.println("Max Float = " + Float.MAX_VALUE);
        System.out.println(" Max Short = " + Short.MAX_VALUE);
        System.out.println(" Max Byte = " + Byte.MAX_VALUE);
        char c = 'a' + 3;
        System.out.println(c);
        System.out.println((int) c);

    }

}
