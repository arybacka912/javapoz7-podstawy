package oop;

import java.util.Objects;

public class User {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public Adress adress;

    public User(){

    }

    public User(String firstName, String lastName, String phoneNumber, String email, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
    }

    public User(String firstName, String lastName) {
        // constructor --> coś musi zostać wpisane żeby przejść dalej
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(email, user.email) &&
                Objects.equals(adress, user.adress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, phoneNumber, email, adress);
    }

    public void introduceYourself() {
    int age = 11;
        System.out.println(this.firstName + " " + lastName + ", phone Number: " + phoneNumber + ", email: " + email);
        if (adress != null) {
            adress.show();
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
