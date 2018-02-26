package piate;

public class Methods {
    public static void main(String[] args) {
        int[] array = {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8};

        printArray(array);
        int sum = sumOfArray(array);
        double avg = avg(array);

        System.out.println(" Sum = " + sumOfArray(array));
        System.out.println("Avg = " + avg(array));
        System.out.println("Min = " + min(array));
        System.out.println("Max = " + max(array));
        System.out.println("Spread = " + spread(array));
        printArray(statsOfOccurences(array));
        System.out.println("Moda = " + moda(array));
        printArray(sortByCounting(array));

//        sumOfArray(array);
//        avg(array);
//        int[] newArray = new int[5];
//        for (int i = 0; i < newArray.length ; i++) {
//        newArray[i] = i;
//        }
//        printArray(newArray);
//        System.out.print("Sum = ");
//        sumOfArray(newArray);
//        avg(newArray);
    }

    // STATYSTYKI
    // 1. napisać metodę która zwraca wartość najmniejszego elementu z tablicy
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // 2. napisać metodę która zwraca wartość największego elementu z tablicy
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //do wyliczenia mediany potrzebujmey indeksu największej wartości (max)
    public static int indexOfMax(int[] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        return iMax;
    }

    // 3. moda
    public static int moda(int[] array) {
        int[] stats = statsOfOccurences(array);
        int indexOfMaximumValue = indexOfMax(stats);
        return indexOfMaximumValue + min(array);
    }

    // 4. rozpiętość
    public static int spread(int[] array) {
        return max(array) - min(array) + 1;
    }

    // 5. informację o wystąpieniach liczb
    public static int[] statsOfOccurences(int[] array) {
        int[] statsArray = new int[spread(array)];
        int min = min(array);
        for (int i = 0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }


    //6*. na podstawie poprzednich metod wypisać posortowana tablicę (sortowanie)
    public static int[] sortByCounting (int[] array) {
        int[] sortedArray = new int[array.length];
        int[] stats = statsOfOccurences(array);
        int k = 0;
        // int[] sortedArray = new int [sumOfArray(stats)];
        for (int i = 0; i < stats.length ; i++) {
            for (int j = 0; j < stats[i] ; j++) {
             sortedArray[k] = i + min(array);
             k++;
            }
        }
        return sortedArray ;
    }

    public static double avg(int[] array) { // void zmieniamy na double, int lub cokolwiek żeby zwrócić wartość
        int sum = sumOfArray(array); //duplikujemy metodę z liczenia sumy
        return (double) sum / array.length;
    }

// napisać funkcje którą przyjmuje tablice liczb i wypisuje ich sumę
    public static int sumOfArray(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length ; i++) {
                sum += array[i];
            }
           return sum; // ZAWSZE ostatnia linijka
        }

    public static void printArray(int[] array) {
      //  int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
