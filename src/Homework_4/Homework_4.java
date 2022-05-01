package Homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scan_one = new Scanner(System.in);

        List<String> list_one = new ArrayList<>();

        boolean stop = false;

        while (!stop) {
            System.out.println("Enter the name");

            String name = scan_one.nextLine();

            if (name.toLowerCase(Locale.ROOT).equals("stop")) {
                stop = true;
            } else {
                list_one.add(name);
            }
        }

        for (int i = 0; i <= list_one.size() - 1; i++) {
            System.out.println(list_one.get(i));
        }
    }
}
