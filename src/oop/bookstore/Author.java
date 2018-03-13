package oop.bookstore;

import java.util.Objects;

public class Author {
    private String name;
    private String birthDate;
    private String language;

    public Author() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(birthDate, author.birthDate) &&
                Objects.equals(language, author.language);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, birthDate, language);
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