package Homework19;


import java.sql.*;
import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice");

        int choice = scanner.nextInt();

        final String URL = "jdbc:mysql://localhost:3310/homework1";

        final String LOGIN = "root";

        final String PASSWORD = "11111";

        Connection connection = null;

        Statement statement = null;

        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

        statement = connection.createStatement();


        switch (choice) {
            case 1 -> {
                addData(scanner, statement);
            }

            case 2 -> {
                deleteData(scanner, statement);
            }

            case 3 -> {
                updateData(scanner, statement);
            }

            case 4 -> {
                retrieveData(scanner, statement);
            }

            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    public static void addData(Scanner scanner, Statement statement) throws SQLException {
        System.out.println("Enter the name");
        String name = scanner.next();
        System.out.println("Enter the surname");
        String surname = scanner.next();
        System.out.println("Enter the country");
        String country = scanner.next();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the bday");
        String bday = scanner.next();
        System.out.println("Enter the city");
        String city = scanner.next();
        System.out.println("Enter the salary");
        int salary = scanner.nextInt();
        String query = String.format("INSERT INTO `homework1`.`niggers` (`id`, `n" +
                "ame`, `surname`, `country`, `age`, `bday`, `city`, `salary`) VALUES (null, '%s'," +
                " '%s', '%s', %d, '%s', '%s', %d );", name, surname, country, age, bday, city, salary);
        System.out.println(query);
        statement.executeUpdate(query);
    }

    public static void deleteData(Scanner scanner, Statement statement) throws SQLException {
        System.out.println("Enter the id of the row");
        int id = scanner.nextInt();
        String query2 = String.format("DELETE FROM `niggers` WHERE `id` = %d", id);
        statement.addBatch(query2);
        statement.addBatch("SET @num := 0;");
        statement.addBatch("UPDATE `niggers` SET `id` = @num := (@num+1);");
        statement.addBatch("ALTER TABLE `niggers` AUTO_INCREMENT =1;");
        statement.executeBatch();
    }

    public static void updateData(Scanner scanner, Statement statement) throws SQLException {
        System.out.println("Enter the id of the row");
        int id2 = scanner.nextInt();
        System.out.println("Enter the name");
        String name2 = scanner.next();
        System.out.println("Enter the surname");
        String surname2 = scanner.next();
        System.out.println("Enter the country");
        String country2 = scanner.next();
        System.out.println("Enter the age");
        int age2 = scanner.nextInt();
        System.out.println("Enter the birthdate");
        String birthdate = scanner.next();
        System.out.println("Enter the city");
        String city2 = scanner.next();
        System.out.println("Enter the salary");
        int salary2 = scanner.nextInt();
        String query3 = String.format("UPDATE `homework1`.`niggers` SET  `name` " +
                        "= '%s', `surname` = '%s', `country` = '%s', `age` = %d, `bday` = '%s', 'city' " +
                        "= '%s', 'salary' = %d WHERE (`id` = %d);", name2, surname2, country2, age2,
                birthdate, city2, salary2, id2);
        statement.executeUpdate(query3);
    }

    public static void retrieveData(Scanner scanner, Statement statement) throws SQLException {
        String query = "SELECT * FROM `niggers`";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String country = resultSet.getString("country");
            int age = resultSet.getInt("age");
            String bday = resultSet.getString("bday");
            String city = resultSet.getString("city");
            int salary = resultSet.getInt("salary");

            System.out.println("--------" + name
                    + "--------" + surname +
                    "--------" + country + "--------" + age +
                    "--------" + bday + "--------" + city + "--------" + salary);
        }

    }
}

