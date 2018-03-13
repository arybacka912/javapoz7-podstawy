package collections;

import oop.User;
import oop.message.RandomMessage;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
//        Set<String> test = new HashSet<>();
//        showList(Arrays.asList("Jan", "Anna", "Szymon", "Karolina"));
//        Random random = new Random ();
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        while (uniqueNumbers.size() < 10) {
//            uniqueNumbers.add(random.nextInt(10));
//        }
//        System.out.println(uniqueNumbers.size());
//        uniqueNumbers.add(5);
//        System.out.println(uniqueNumbers.size());
//        for (Integer uniqueNumber : uniqueNumbers) {
//            System.out.println(uniqueNumber);
//        }

        Set<User> users = new HashSet<>();
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Jan", "Kowalski"));
        System.out.println(users.size());

        User user = new User("Jan", "Kowalski");
        User user2 = new User("Jan", "Kowalski");
        System.out.println(user == user2);
        System.out.println(user.equals(user2));

        Map<String, User> map = new TreeMap<>();
        map.put("123456789", new User("Szymon", "Nowak"));
        map.put("5674655343", new User("Anna", "Wiśniewska"));
        map.put("5674254163", new User("Anna", "Wiśniewska"));
        map.put("1234455343", new User("Anna", "Wiśniewska"));
        map.put("8766655343", new User("Anna", "Wiśniewska"));
        map.put("2356", new User("Jan", "Kowalski"));
        User remove = map.remove("2356");
        User user1 = map.get("123456789");




        Set<Map.Entry<String, User>> entries = map.entrySet();
        for (Map.Entry<String, User> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
//        List<String> names = new LinkedList<>();
//        names.add("Jan");
//        names.add("Karolina");
//        for (String name : names) {
//            System.out.println(name);
//        }


    private static void showList(List<String> list) {

        for (String value : list) {
            if (value.length() > 5) {
                System.out.println(value);
            }
        }
        //lub
//        for (int i = 0; i < list.size(); i++) {
        //     String value = list.get(i);
//            if (list.get(i).length() > 5) {
//                System.out.println(list.get(i));
//            }
        }


        private static void ListExample () {
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

        private static <T> void showArray (T[]array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

