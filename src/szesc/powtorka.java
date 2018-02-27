package szesc;

import java.util.Arrays;

public class powtorka {
    public static void main(String[] args) {
        String[] names = {"Jan", "Anna", "Eliza", "Dorian", "Agnieszka"};
        System.out.println("Women's names = " + womensNamesCounter(names));
        System.out.println("Number of a in Anna = " + lettersCounter("AnnaA", 'A') );
        System.out.println("Number od a in " + Arrays.toString(names) + " = " + lettersCounter(names, 'a'));
    }


    // zadania rozgrzewkowe:
    //1. Metoda przyjmująca tablicę stringów z imionami, zliczamy w pętli ile jest żeńskich imion endsWith() - a
    public static int womensNamesCounter(String[] names) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
//            if (names[i].endsWith("a")) {
//                counter++;
//            }
            if(endsWith(names[i], "a")) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean endsWith(String text, String searchingValue) {
        boolean result = false;
        if (searchingValue.length() <= text.length()) {
            int i = searchingValue.length() - 1;
            char[] textAsCharArray = text.toCharArray();
            char[] searchvalueAsCharArray = searchingValue.toCharArray();

            int aLength  = textAsCharArray.length;
            int bLength = searchvalueAsCharArray.length;
            while (i >= 0 && searchvalueAsCharArray[i] == textAsCharArray[aLength + i - bLength]) {
                //                 b[i]                              a[aLength + i - bLength]
                i--;
            }
            result = i == -1;
        }
        return result;
    }



    //2. zliczamy wystąpienia litery (niezależnie od tego czy jest to mała, czy wielka litera) w stringu np. "Ala ma kota"
    public static int lettersCounter (String text, char c) {
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length - 1; i >= 0 ; i--) {
            if (capitalize(chars[i]) == capitalizedChar){
                counter++;
            }
        }
        return counter;
    }
    //3. Zwracamy uwagę na wielką i mała literę
    //warunek ? wartość wyświetlona jeśli true : wartość wyświetlania jeśli false;
    // c+= (c == 'a' ? 1 : -1);
    public static char capitalize(char c){
        // return (c >= 'a' && c <= 'z' ? (char) (c - 32) : c;
        if( c >= 'a' && c <= 'z') {
            c = (char) (c - 32);
        }
        return c;
    }
    public static int lettersCounter (String [] messages, char c) {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            counter += lettersCounter(messages[i], c);
        }
        return counter;
    }

}
