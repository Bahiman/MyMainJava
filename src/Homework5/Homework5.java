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

        while (is_on) {

            System.out.println("Add(1); Stop(2), Show(3) Find(4)");

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


                case 4:
                    System.out.println("Enter the name to check");

                    String nameCheck = checker.next();

                    System.out.println("Enter birth date to check");

                    String birthCheck = checker.next();

                    System.out.println("Enter the country");

                    String countryCheck = checker.next();

                    System.out.println("Enter the salary to check");

                    int salaryCheck = checker.nextInt();

                    Human new_human = new Human(
                            nameCheck,
                            birthCheck,
                            countryCheck,
                            salaryCheck
                    );

                    if (check(new_human, humanBase)) {
                        System.out.println("Human found");
                    } else {
                        System.out.println("Human not found");
                    }

                    break;

                default:
                    System.out.println("What else did u write?");
                    break;
            }
        }

    }

    public static boolean check(Human humanToCheck, Set<Human> humanSet) {
        boolean result = false;

        for (Human h : humanSet) {
            if (
                    h.getName().equals(humanToCheck.getName()) &&
                            h.getBirthday().equals(humanToCheck.getBirthday()) &&
                            h.getSalary().equals(humanToCheck.getSalary()) &&
                            h.getCountry().equals(humanToCheck.getCountry()) &&
                            Objects.equals(h.getSalary(), humanToCheck.getSalary())
            ) {
                result = true;
                break;
            }
        }

        return result;
    }
}
