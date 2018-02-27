package szesc;

import sun.swing.StringUIClientPropertyKey;
import trzecie.Warmup;

import javax.swing.*;
import java.util.Scanner;

public class Methods2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 34, 5, 6, 7, 8, 9};
        System.out.println("Factorial of 5 = " + factorial(5));
        System.out.println("Divisible by 2 and not by 3 = " + countDivisibleBy2AndNotBy3(array));
        System.out.println("Switched text = " + switchChars("ala ma kota", 'a', 'b'));
        System.out.println("\"123\" is number = " + isNumber("123"));
        System.out.println("\"2a3\" is number = " + isNumber("2a3"));
        System.out.println("\"kajak\" is polindrome = " + isPolindrome("kajak"));
        System.out.println("\"abcdefgh\" is polindrome = " + isPolindrome("abcdefgh"));
    }

    public static long factorial(int number) {
        //1. silnia (factorial) --> long
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;

    }

    //2. zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3
    public static int countDivisibleBy2AndNotBy3(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                counter++;
            }
            // counter += (array[i] % 2 == 0 && array[i] % 3 != 0) ? 1 : 0;
        }
        return counter;
    }

    //3. zamiana jednego znaku na drugi w danym stringu
    public static String switchChars(String text, char from, char to) {
        char[] textAsChars = text.toCharArray(); //traktujemy to jako tablicę znaków
        for (int i = 0; i < textAsChars.length; i++) {
            if (textAsChars[i] == from) {
                textAsChars[i] = to;
            }

        }
        return String.valueOf(textAsChars);
    }
    //4. split -->123;abc;dd --> ["123", "abc", "dd"]
//         dd.aa.cc -> ["dd","aa","cc"]
    public static boolean isNumber(String numberCandidate){
        char[] chars = numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9') ) {
            i++;

        }
        return i == chars.length;
    }
    //5. czy text jest polindromem anna-->anna true,  abc-->cba false
    public static boolean isPolindrome (String text) {
        char[] chars = text.toCharArray();
        boolean result = true;
        int i =0;
        while ( i < chars.length / 2 && (powtorka.capitalize(chars[i]) == powtorka.capitalize(chars[chars.length - i - 1]))) {
            i++;
        }
        return i == chars.length / 2;
    }
    //6. fibonacci
//    public static String[] split(String message) {
//        String[] array = new int[powtorka.lettersCounter(message, c)];
//        int start = 0;
//      //  int end = getNthIndexOf(c, message, 0);
//        return array;
//    }


}





//7. sprawdzanie nawiasów w stringu
//8. sprawdzenie czy string jest liczbą
//9. metoda wyświetlająca sumę liczb pierwszych w danej liczbie (1,2,3,5,7,11) np.
//                  liczba 29 = 11 + 11 + 7
//                  liczba 31 = 11 + 11 + 7 + 2


