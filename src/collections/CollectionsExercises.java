package collections;

import oop.User;
import oop.bookstore.Author;
import oop.bookstore.Book;


import java.lang.reflect.Array;
import java.util.*;

public class CollectionsExercises {

    public static void main(String[] args) {
        //2. pobieramy od usera n liczb, wyświetlić tylko unikalne
        //3. utworzyć mapę PESEl(String) --> User
        //4. utworzyć mapę Autor --> Lista książek
        //5. utworzyć listę liczb (random) oraz wyświetlić liczby podzielne przez 2
        //6. utworzyć listę liczb random) oraz wyświeltlić tylko elementy na parzystych indeksach
        //7. na podstawie LinkedList, utworzyć kolejke fifo -->MyFifiQueue
        bookstore();
        uniqueNumbersFromUser();


     /*

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        randomUnique(list);

      Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
        */
    }

    //zad 4. Utworzyć mapę Autor --> lista książek
    public static void bookstore() {
        Map<Author, List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("Adam Mickiewicz"),
                Arrays.asList(
                new Book("Dziady 3", 1800),
                new Book("Dziady 4", 1802)));

    bookstore.put(new Author(" Henryk Sienkiewicz"),
            Arrays.asList(
            new Book("Quo Vadix", 1900),
            new Book("Krzyżacy", 1902)));

    Set<Map.Entry<Author, List<Book>>>bookstoreSet = bookstore.entrySet();
        for (Map.Entry<Author, List<Book>> authorListEntry : bookstoreSet) {
            List<Book> books = authorListEntry.getValue();
            for (Book book : books) {
                if (book.getReleaseYear() > 1801) {
                    System.out.println(book);
                }
            }
        }

}



    // zad. 3 utworzyć mapę PESEL(String) --> User
    public static void usersDatabas() {
        Map<String, User> usersDatabase = new HashMap<>();
        usersDatabase.put("123456789", new User("Szymon", "Nowak"));
        usersDatabase.put("925458752", new User("Agata", "Nowicka"));
        usersDatabase.put("925151512", new User("Dorota", "Nysa"));
        Set<Map.Entry<String, User>> entries = usersDatabase.entrySet();
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();  //*
        while (iterator.hasNext()) {                                      //*
            Map.Entry<String, User> next = iterator.next();               //*
            System.out.println(next.getKey() + ": " + next.getValue());
        }
        // * lub for(Map.Entry<String, User> entry : entries){ }
    }


    //zad. 2 pobieramy od usera n liczb, wyświetlić tylko unikalne
    public static void uniqueNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int nextValue = scanner.nextInt();
            set.add(nextValue);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // zad. 1 randomowe liczby wyświetlone w consoli
    private static void randomUnique(List<Integer> numbers) {
        List<Integer> tmpList = new ArrayList<>(numbers);
        Random random = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            int index = random.nextInt(tmpList.size());
            System.out.println(tmpList.remove(index));
        }

    }

    private static void showList(List<String> list) {

        for (String value : list) {
            if (value.length() > 5) {
                System.out.println(value);
            }
        }
    }
}
