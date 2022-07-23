package Homework20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        ConnectionDB connectionDB = new ConnectionDB();

//        Statement statement = connectionDB.;

        Class c = Class.forName("Homework20.ConnectionDB");

        Object obj = c.newInstance();

        Method method = c.getDeclaredMethod("statement");

        method.setAccessible(true);

        Statement statement = (Statement) method.invoke(obj, null);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur choice: insert, delete, update, row, table");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> insertData(statement, scanner);

            case 2 -> deleteData(statement, scanner);


            case 3 -> updateData(statement, scanner);

            case 4 -> getRow(statement, scanner);


            case 5 -> getData(statement, scanner);

            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }

    }

    public static void insertData(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter the country");
        String country = scanner.next();
        System.out.println("Enter the city");
        String city = scanner.next();
        String query = String.format("INSERT INTO COUNTRIES VALUES(null,'%s','%s')",country,city);
        statement.executeUpdate(query);
    }

    public static void deleteData(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter the id of the row");
        int id = scanner.nextInt();
        String query = String.format("DELETE FROM COUNTRIES WHERE 'id' = %d", id);
        statement.addBatch(query);
        statement.addBatch("SET @num := 0;");
        statement.addBatch("UPDATE `countries` SET `id` = @num := (@num+1);");
        statement.addBatch("ALTER TABLE `coutnries` AUTO_INCREMENT =1;");
        statement.executeBatch();
    }

    public static void updateData(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter the id of the row");

        int id = scanner.nextInt();

        System.out.println("Enter the desired country");

        String country = scanner.nextLine();

        System.out.println("Enter the desired city");

        String city = scanner.nextLine();

        String query = String.format("UPDATE `homework1`.`countries` " +
                        "SET `country` = '%s', `city` = '%s' WHERE (`id` = '%d');",
                country, city, id);

        statement.executeUpdate(query);
    }

    public static void getRow(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter the id");

        int id = scanner.nextInt();

        String query = "SELECT * FROM countries";

        ResultSet resultSet = statement.executeQuery(query);

        int current_num = 0;

        while(resultSet.next()){
            current_num++;
            if (current_num == id) {
                String count = resultSet.getString("country");
                String city = resultSet.getString("city");

                System.out.println(count + "-----" + city);
                break;
            }
        }

    }

    public static void getData(Statement statement, Scanner scanner) throws SQLException {
        String query = "SELECT * FROM countries";

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            String count = resultSet.getString("country");
            String city =  resultSet.getString("city");
            System.out.println(count + "-----" + city );
        }
    }
}
