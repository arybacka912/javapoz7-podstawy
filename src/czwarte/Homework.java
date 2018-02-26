package czwarte;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        // zadanie domowe//
        //kodowanie i odkodowywanie szyfru cezara

        /*
        int offset = 1;
        String secretMessage = "ala ma kotZa z";
        String expectedMessage = "bmb nb lpuAb a";
        char[] chars = secretMessage.toCharArray(); //traktujemy to jako tablicę znaków
        for (int i = 0; i < chars.length; i++) {
            if ( (chars[i]>= 'a' && chars[i] <= 'z') || (chars[i]>= 'A' && chars[i]<= 'Z')) {
                if ((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') {
                    chars[i] = 'A';
                } else if ((chars[i] + offset) > 'z') {
                    chars[i] = 'a';
                } else {
                    chars[i] += offset;
                }
            }
        }
        System.out.println("Expected = "+ expectedMessage);
        System.out.println("Actual = " + String.valueOf(chars));
            System.out.println("Correct = " + (expectedMessage.equals(String.valueOf(chars))));
*/
        // ASCII Table
        //kodowanie
        int offset = 2;
        String secretMessage = "ala ma kotZa zy";
        String expectedMessage = "cnc oc mqvBc ba";
        char[] chars = secretMessage.toCharArray(); //traktujemy to jako tablicę znaków
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                if ((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') {
                    chars[i] = (char) (chars[i] + 26 - offset);
                } else if ((chars[i] + offset) > 'z') {
                    chars[i] = (char) (chars[i] + 26 - offset);
                } else {
                    chars[i] += offset;
                }
            }
        }
        System.out.println("Expected = " + expectedMessage);
        System.out.println("Actual = " + String.valueOf(chars));
        System.out.println("Correct = " + (expectedMessage.equals(String.valueOf(chars))));
        System.out.println();
        //odkodowywanie:
        String codedMessage = "bmb nb lpuAb az";
        int offsetDecode = 1;

        char[] charsOfCodedMessage = codedMessage.toCharArray(); //traktujemy to jako tablicę znaków
        for (int i = 0; i < charsOfCodedMessage.length; i++) {
            if ((charsOfCodedMessage[i] >= 'a' && charsOfCodedMessage[i] <= 'z') || (charsOfCodedMessage[i] >= 'A' && charsOfCodedMessage[i] <= 'Z')) {
                if (chars[1] == 'a' || chars[i] == 'A') {
                } else if ((charsOfCodedMessage[i] + offset) > 'z') {
                    charsOfCodedMessage[i] = (char) (charsOfCodedMessage[i] - 26 + offsetDecode);
                } else {
                    charsOfCodedMessage[i] -= offsetDecode;
                }
            }
        }
            System.out.println("Expected = " + secretMessage);
            System.out.println("Actual = " + String.valueOf(charsOfCodedMessage));
            System.out.println("Correct = " + (expectedMessage.equals(String.valueOf(charsOfCodedMessage))));

            //tablica liczb. definiujecie liczbę np .3  ( 1,2,3,4,5,6) - dwie tablice 123 i 456
            //--> tworzymy 2 tablice z elementami odpowiednio mniejszymi i większymi
        System.out.println();
        int[] numbers = { 10,20,30,40,60,70,80};
        int searchingNumber = 40;

       int i = 0;
        while (i < numbers.length && numbers[i] != searchingNumber){
            i++;
        }
        if (i < numbers.length) {

            int[] smallerNumbersArray = new int [i+1];
            int[] biggerNumbersArray = new int [numbers.length - (i + 1)];

            for ( int j = 0; j < smallerNumbersArray.length; j++) {
                smallerNumbersArray[j] = numbers[j];
            }
            for (int j = 0; j < biggerNumbersArray.length; j++) {
                biggerNumbersArray[j] = numbers[j + i + 1];

            }
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(smallerNumbersArray));
            System.out.println(Arrays.toString(biggerNumbersArray));
        }else {
            System.out.println("Number " + searchingNumber + " not found.");
        }
        }
    }




