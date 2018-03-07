package oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        User user = createUser(scanner);

        System.out.println(user.firstName);


        Adress adress = new Adress();
        adress.city = "Poznan";
        adress.street = "Polwiejska";
        adress.number = 20;
        adress.postalCode = "60 -371";
        // adress.show();

        user.adress = adress;
        user.introduceYourself();
    }

    public static User createUser(Scanner scanner) {

        User user = new User();
        System.out.println("Insert firstName");
        user.firstName = scanner.nextLine();

        System.out.println("Insert lastName");
        user.lastName = scanner.nextLine();

        System.out.println("Insert phoneNumber");
        user.phoneNumber = scanner.nextLine();

        System.out.println("Insert email");
        user.email = scanner.nextLine();

        return user;

    }
}

