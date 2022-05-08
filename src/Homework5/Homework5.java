package Homework5;

import kotlin.jvm.internal.SpreadBuilder;

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Human> humanBase = new HashSet<>();

        Set<String> humanNames = new HashSet<>();


        boolean is_on = true;

        boolean was_before = false;

        boolean first_name_exists = false;

        while (is_on) {

            System.out.println("Add(1); Stop(2), Show(3)");

            int choice = input.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter the name");

                    String name = input.next();

                    if (humanNames.contains(name)) {
                        was_before = true;
                    } else {
                        humanNames.add(name);
                    }


                    if (was_before) {
                        System.out.println("Human with this name already exists");
                        break;
                    } else {
                        System.out.println("Enter the birth date");

                        String birth_date = input.next();

                        System.out.println("Enter the country");

                        String country = input.next();

                        System.out.println("Enter the salary");

                        int salary = input.nextInt();

                        Human human = new Human(name, birth_date, country, salary);

                        humanBase.add(human);
                    }

                    break;


                case 2:
                    is_on = false;
                    System.out.println("Nigga what have u done?");
                    break;


                case 3:
                    for (Human human1 : humanBase) {
                        System.out.println("^^^^^^^^^^^^^^^^^^");
                        System.out.println(human1);
                        System.out.println("^^^^^^^^^^^^^^^^^^");

                    }
                    break;


                default:
                    System.out.println("What else did u write?");
                    break;
            }
        }

    }
}
