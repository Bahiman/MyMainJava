package Homework20;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        ConnectionDB connectionDB = new ConnectionDB();

        Statement statement = connectionDB.statement;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ur choice: insert, delete, update, row, table");

        int choice = scanner.nextInt();

        switch (choice){
            case 1 ->{
                insertData(statement, scanner);
            }

            case 2 -> {
                deleteData(statement, scanner);
            }

            case 3 -> {
                updateData(statement, scanner);
            }

            case 4 ->{
                getRow(statement, scanner);
            }

            case 5 ->{
                getData(statement, scanner);
            }
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
        System.out.println("Enter the id");

        int id = scanner.nextInt();

        String query = String.format("SELECT * FROM countries where `id` = %d", id);

        ResultSet resultSet = statement.executeQuery(query);

        String country = resultSet.getString("country");

        String city = resultSet.getString("city");

        System.out.println("-------" + country + "-------" + city);
    }

    public static void getRow(Statement statement, Scanner scanner){

    }

    public static void getData(Statement statement, Scanner scanner){

    }
}
