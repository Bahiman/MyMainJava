package Homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int num_one = num.nextInt();

        ArrayList<Integer> the_one = new ArrayList<>();

        for (int i = 1; i <= num_one; i++) {
            if (num_one % i != 0) {
                System.out.println("The number " + num_one + " is not divisible by " + i);
            } else {
                the_one.add(i);
            }
        }

        System.out.println(the_one);
    }
}
