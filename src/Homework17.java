import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Homework17 {
    public static void main(String[] args) throws SQLException {
        final String URL = "jdbc:mysql://localhost:3310/homework1";

        final String LOGIN = "root";

        final String PASSWORD = "11111";

        Connection connection = null;

        Statement statement = null;

        connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);

        statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the username");

        String username = scanner.nextLine();

        System.out.println("Enter the password");

        String password = scanner.nextLine();


        String query = String.format("insert into `username_password` values(null, \"%s\", \"%s\")",username, password);


        System.out.println(query);

        statement.executeUpdate(query);

        
    }
}
