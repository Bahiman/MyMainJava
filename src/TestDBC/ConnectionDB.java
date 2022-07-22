package TestDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class ConnectionDB {
    private final String URL = "jdbc:mysql://localhost:3310/homework1";

    private final String LOGIN = "root";

    private final String PASSWORD = "11111";

    Connection connection = null;

    Statement statement = null;

    private Statement statement(){

        try {
            connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }
}
