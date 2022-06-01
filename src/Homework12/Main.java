package Homework12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Get info(1), Set info(2)");

            try{
                int choice = Integer.parseInt(bufferedReader.readLine());

                if(choice == 2){
                    System.out.println("Enter the title of the game");

                    String title = bufferedReader.readLine();

                    System.out.println("Enter the genre of the game");

                    String genre = bufferedReader.readLine();

                    System.out.println("Enter the price");

                    int price = Integer.parseInt(bufferedReader.readLine());

                    ArrayList<String> add = new  ArrayList<String>();

                    add.add(title);

                    add.add(genre);

                    add.add(String.valueOf(price));

                    Game game = new Game(title,genre,price);

                    list.addAll(add);

                    System.out.println("DONE");
                } else if (choice == 1) {
                    System.out.println("----------------");
                    System.out.println("Title:");
                    System.out.print(Game.getTitle());
                    System.out.println("----------------");
                    System.out.println("Genre");
                    System.out.print(Game.getGenre());
                    System.out.println("----------------");
                    System.out.println(Game.getPrice());
                } else if (choice == 3) {
                    System.out.println("Enter the id of the game");

                    int id = Integer.parseInt(bufferedReader.readLine());

                    String getting = list.get(id) ;

                    System.out.println(getting);
                } else {
                    System.out.println("There are only 2 options, one and two");
                }

            } catch (IOException | InputMismatchException| NumberFormatException| IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }
}
