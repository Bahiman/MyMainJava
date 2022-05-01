package Homework_4;

import java.util.*;

public class Homework_4_part_two {
    public static void main(String[] args) {

        Scanner scanner_one = new Scanner(System.in);

        boolean stopped = false;

        Map<String, String> user_array = new HashMap<>();


        while (!stopped) {

            String first_text = scanner_one.nextLine();

            String user_name = String.valueOf(first_text.split("---")[0]);

            String password = String.valueOf(first_text.split("---")[1]);

            if (user_name.toLowerCase(Locale.ROOT).equals("stop") || password.toLowerCase(Locale.ROOT).equals("stop")) {
                stopped = true;
            } else {
                user_array.put(user_name, password);
            }

        }
        System.out.println("Usernames");
        for (String niger : user_array.keySet()) {
            System.out.println(niger);
        }

        System.out.println("Passwords");

        for (String nigers : user_array.values()) {
            System.out.println(nigers);
        }
    }
}
