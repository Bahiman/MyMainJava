import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Classwork12 {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter the model of your phone");
//
//        String model = scanner.nextLine();
//
//        System.out.println("Enter the price");
//
//        int price = scanner.nextInt();

        final String URL = "jdbc:mysql://localhost:3310/homework1";

        final String LOGIN = "root";

        final String PASSWORD = "11111";

        Connection connection = null;

        Statement statement = null;

        connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);

        statement = connection.createStatement();

//        String query = String.format("insert into `phone` values(null, \"%s\", %d);", model,price);

        String query ="delete from `elements` where `id` = ";

        System.out.println(query);

       statement.executeUpdate(query);
    }
}
