package Homework18;

public class DataClass {
    private String name;

    private String surname;

    private String country;

    private int age;

    private String bday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public DataClass(String name, String surname, String country, int age, String bday) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.bday = bday;
    }

    @Override
    public String toString() {
        return "DataClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", bday='" + bday + '\'' +
                '}';
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
}
