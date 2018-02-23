package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //napisać pętle która odwraca liczbę np 12345 --> 54321
//        System.out.println("Zadanie 1");
//        int someValue = 154;
//        int reversedNumber = 0;
//        while (someValue != 0) {
//            int digit = someValue % 10;
//            reversedNumber *= 10;
//            reversedNumber += digit;
//            someValue /= 10;
//        }
//            System.out.println("Reversed Number: " + reversedNumber);
//
//
//
//        //wczytujemy n liczb, i sumujemy wsyztskie cyfry 123,456 --> 1+2+3+4+5+6= 21 (ktoś chce podać 5 liczb)
//            System.out.println("zadanie 2");
//            System.out.println("How many values do you want addresult?");
//
//            int n = 4;
//            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                System.out.println("Insert number");
//                int value = scanner.nextInt();
//                //sumowanie cyfr
//                while (value != 0) {
//                    int digit1 = value % 10;
//                    sum += digit;
//                    value /= 10;
//                }
//
//                System.out.println("Sum = " + sum);
//
//            // pozbyć się wszystkich 0 z liczby np. 120002 --> odwrócona wersja 221
//            int numberWithZeros = 12002;
//            int numberWithoutZeros = 0;
//            while (numberWithZeros != 0) {
//                int digit1 = numberWithZeros % 10;
//                if (digit1 != 0) {
//                    numberWithoutZeros *= 10;
//                    numberWithoutZeros += digit1;
//                }
//                numberWithZeros /= 10;
//            }
//            System.out.println(("Number Without Zeros = ") + numberWithoutZeros);
        // || lub bez odwracania liczb:
       // int numberWithZeros = 12002;
//            int numberWithoutZeros = 0;
        // //   int multiplier = 1;
//            while (numberWithZeros != 0) {
//                int digit1 = numberWithZeros % 10;
//                if (digit1 != 0) {
//                    numberWithoutZeros *= 10;
        //              multiplier *= 10;
//
//                }
//                numberWithZeros /= 10;
//            }
//            System.out.println(("Number Without Zeros = ") + numberWithoutZeros);
        //podajemy liczby tak długo, aż nie zostanie podane 0. Wypisujemy największą liczbę


        int value = scanner.nextInt();
        int maxValue = scanner.nextInt();
        while (value != 0) {
            value = scanner.nextInt();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("MaxValue = " + maxValue);
// sprawdzanie ilości cyfr 123=3 123/10 = 12,3 /10 =1,23/10 = 0,123, 12345 =5
        System.out.println("Insert number:");
        int n = scanner.nextInt();
        int numberOfDigits = 0;
        if (n == 0) {
            numberOfDigits++;
        }
        while (n != 0) {
            numberOfDigits++;
            n = n / 10; // n/= 10
        }
        System.out.println("Number of digits = " + numberOfDigits);
        // suma cyfr liczby
        System.out.println(" Addresult:");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits = " + sum);

        // program liczący ilość podanej cyfry w liczbie
        System.out.println("How many times do you insert this numbers");
        int anotherNumber = scanner.nextInt();
        int searchForNumber = scanner.nextInt(); // =2;
        int counter = 0;
        while (anotherNumber != 0) {
            int nextNumber = anotherNumber % 10;
            if (nextNumber == searchForNumber) {
                counter++;
            }
            anotherNumber /= 10;
        }
        System.out.println("Found " + counter + " numbers " + searchForNumber);


        //wypisać dzielnik liczby
        System.out.println("Divisor of the number");
        int numberToGetDividers = scanner.nextInt();
        for (int i = 1; i <= numberToGetDividers / 2; i++){
            if (numberToGetDividers % i == 0) {
                System.out.println("Divider: " + i);
            }
        }
        System.out.println("For number " + numberToGetDividers);

        //sprawdzić czy liczba jest pierwsza
        System.out.println(" Primary number:");
        int primaryNumberCandidate = scanner.nextInt();
        int i = 2; //1 nie powinno się sprawdzać!!!
        boolean isPrimary = true;
        // while (isPrimary && i <== Math.sqrt ("primaryNumberCandidate)
        while (isPrimary && i <= primaryNumberCandidate / 2) {
            if (primaryNumberCandidate % i == 0) {
                isPrimary = false;
            }
            i++;

        }
        if (isPrimary == true) {
            System.out.println("Number is primary");
        } else {
            System.out.println("Number is not primary");
        }

        //menu
        int option = 1;
        while (option != 0) {
            System.out.println("1. New");
            System.out.println("2. Load");
            System.out.println("3. About");
            System.out.println("0. Quit");
            option = scanner.nextInt();
            System.out.println();
            System.out.println();


        }
        //wyliczyć średnią podanych liczb
        // "dupochron" - licby parzyste większe od 10 ( wynik pętli musi być poprawna liczba)- póki ktoś nie wstawi tej liczby poprawnej puty będzie się aplikacja pytać
        //binarna reprezentacja liczby
    }private static void exampleWhile() {
        Scanner scanner = new Scanner(System.in);
        whileLoop(scanner);
    }

    private static void whileLoop(Scanner scanner) {
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




