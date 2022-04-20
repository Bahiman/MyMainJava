package Homework_1;

import java.util.Scanner;

public class Sub {
    public Sub(String joe, String s, String s1) {
    }

    public static void task_one() {

        System.out.println("Enter the number");

        Scanner niger = new Scanner(System.in);

        int number = Integer.parseInt(niger.nextLine());

        System.out.println(Math.cbrt(number));

    }

    public static void task_two() {

        System.out.println("Enter the character");

        Scanner character = new Scanner(System.in);

        String character_ = character.nextLine();


        System.out.println("Enter the height");

        Scanner height_ = new Scanner(System.in);

        int height = Integer.parseInt(height_.nextLine());

        System.out.println("Enter the width");

        Scanner width_ = new Scanner(System.in);

        int width = Integer.parseInt(width_.nextLine());

        for (int a = 0; a < height; a++) {
            for (int b = 0; b < width; b++) {
                System.out.print(character_);
            }
            System.out.println();
        }
    }

}
