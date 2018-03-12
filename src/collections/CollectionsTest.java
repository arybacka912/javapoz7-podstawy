package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Jan");
        names.add("Karolina");
        for (String name : names) {
            System.out.println(name);
        }

        }



    private static void ListExample() {
        // Lista:
        List<String> names = new ArrayList<>();
        names.add("Szymon");
        names.add("Szymon");
        names.add("Szymon");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(1));
        }
        // lub for lub forech

        for (String value : names) {
            System.out.println(value);
        }

        // lub names.for --> for (String value : names)
    }

    private static <T> void showArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
