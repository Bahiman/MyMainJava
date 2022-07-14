package Homework18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JOEMAMA {
    public static void main(String[] args) throws SQLException {
        final String URL = "jdbc:mysql://localhost:3310/homework1";

        final String LOGIN = "root";

        final String PASSWORD = "11111";

        Connection connection = null;

        Statement statement = null;


        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

        statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the choice");

        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
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

                DataClass dataClass = new DataClass(name, surname, country, age, bday);

                String query = String.format("insert into `niggers` values(null,'%s','%s', '%s', %d, '%s' )", name, surname, country, age, bday);

                System.out.println(query);

                statement.executeUpdate(query);

                break;
            case 2:
                System.out.println("Enter the id of the row");

                int id = scanner.nextInt();

                String query2 = String.format("DELETE FROM `niggers` WHERE `id` = %d", id);

                statement.executeUpdate(query2);

                break;
            case 3:
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

                System.out.println("Ent+er the birthdate");

                String birthdate = scanner.next();

                String query3 = String.format("UPDATE `homework1`.`niggers` SET  `name` = '%s', `surname` = '%s', `country` = '%s', `age` = %d, `bday` = '%s' WHERE (`id` = %d);", name2,surname2,country2, age2, birthdate, id2 );

                statement.executeUpdate(query3);

                break;
        }

    }
}

