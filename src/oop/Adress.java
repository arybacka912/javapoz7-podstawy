package oop;

public class Adress {
        public String city;
        public String street;
        public String postalCode;
        public int number;

        public Adress(){

        }

    public Adress(String city, String street, String postalCode, int number) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.number = number;
    }

    public void show() {
        System.out.println(postalCode + " " + city + ", ul. " + street + " " + number);
    }
    }


