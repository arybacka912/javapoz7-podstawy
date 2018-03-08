package oop.bookstore;

public class Author {
    private String name;
    private String birthDate;
    private String language;

    public Author() {

    }
    public Author(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name.toUpperCase(); // zwraca String z wielkimi literami
    }



    public String getBirthDate() {
        return birthDate;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + this.getName() + '\'' + // duże litery
                ", birthDate='" + birthDate + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}