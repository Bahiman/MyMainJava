package Homework5;

public class Human {
    private String name;

    private String birthday;

    private String country;

    private Integer salary;

    public Human(String name, String birthday, String country, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCountry() {
        return country;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
