package Homework5;

import kotlin.jvm.internal.SpreadBuilder;

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Human> humanBase = new HashSet<>();

        Set<String> humanNames = new HashSet<>();

        Scanner checker = new Scanner(System.in);

        boolean is_on = true;

        boolean was_before = false;

        int similar_human_counter = 0;


        while (is_on) {

            System.out.println("Add(1); Stop(2), Show(3) Find(4) Delete(5)");

            int choice = input.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter the user_name");

                    String user_name = input.next();

                    if (humanNames.contains(user_name)) {
                        was_before = true;
                    } else {
                        humanNames.add(user_name);
                    }


                    if (was_before) {
                        System.out.println("Human with this user_name already exists");
                        break;
                    } else {

                        System.out.println("Enter the real name");

                        String name = input.next();

                        System.out.println("Enter the birth date");

                        String birth_date = input.next();

                        System.out.println("Enter the country");

                        String country = input.next();

                        System.out.println("Enter the salary");

                        int salary = input.nextInt();

                        Human human = new Human(user_name,name, birth_date, country, salary);

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


                case 4:

//                    System.out.println("Enter user_name to check");

                    String userNameCheck = "";

                    System.out.println("Enter the real name to check");

                    String nameCheck = checker.next();

                    System.out.println("Enter birth date to check");

                    String birthCheck = checker.next();

                    System.out.println("Enter the country");

                    String countryCheck = checker.next();

                    System.out.println("Enter the salary to check");

                    int salaryCheck = checker.nextInt();

                    Human new_human = new Human(
                            userNameCheck,
                            nameCheck,
                            birthCheck,
                            countryCheck,
                            salaryCheck
                    );

                    if (Finder.check(new_human, humanBase)) {
                        System.out.println("Human found at " + new_human);
                    } else {
                        System.out.println("Human not found");
                    }

                    break;

                case 5:
                    System.out.println("Enter the nick of the person you want to delete");

                    String niger_ins = input.next();

                    Human new_delete_human = new Human(
                        niger_ins,
                            "",
                            "",
                            "",
                            0
                    );

                    if(Deleter.delete_check(new_delete_human, humanBase)){
                        System.out.println("Human found");
                    } else{
                        System.out.println("User not found");
                    }

                    break;

                default:
                    System.out.println("What else did u write?");
                    break;
            }
        }

    }
}
