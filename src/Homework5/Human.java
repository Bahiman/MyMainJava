package Homework5;

public class Human {

    private String user_name;

    private String name;

    private String birthday;

    private String country;

    private Integer salary;

    public Human(String user_name, String name, String birthday, String country, int salary) {
        this.user_name = user_name;
        this.name = name;
        this.birthday = birthday;
        this.country = country;
        this.salary = salary;
    }

    public String getUser_name() {
        return user_name;
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
                "user_name='" + user_name + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }
}
