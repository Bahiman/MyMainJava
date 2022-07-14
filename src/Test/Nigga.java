package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Nigga {
    public static void main(String[] args)  {
        final  String URL = "jdbc:mysql://localhost:3310/homework1";

        final  String login = "root";

        final  String password = "11111";

        Connection connection = null;

        Statement statement = null;

        try {
            connection = DriverManager.getConnection(URL,login,password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("LESSGO");

    }
}
