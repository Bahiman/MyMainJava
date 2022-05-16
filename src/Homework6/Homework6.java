package Homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the file");

        String name_of_the_file = input.next();

        File fileForPlayers = new File("src/Homework6/" + name_of_the_file + ".txt");

        if (fileForPlayers.createNewFile()) {
            System.out.println("File was successfully created");
        } else {
            System.out.println("File was already created");
        }

        boolean is_on = true;

        while (is_on) {
            System.out.println("Enter the name of the player:");

            String player = input.next();

            if (player.equalsIgnoreCase("stop")) {
                is_on = false;
            } else {
                FileWriter fileWriter = new FileWriter(fileForPlayers, true);
                fileWriter.append(player);
                fileWriter.append("\n");
                fileWriter.flush();
            }

        }

        input.close();

    }
}
