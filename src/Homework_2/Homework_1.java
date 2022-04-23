package Homework_2;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner number_one = new Scanner(System.in);
        int num_one = number_one.nextInt();


        System.out.println("Enter the second number");
        Scanner number_two = new Scanner(System.in);
        int num_two = number_two.nextInt();

        System.out.println("Enter the operation");
        Scanner number_three = new Scanner(System.in);
        char action = number_three.next().charAt(0);

        if (action == '+') {
            System.out.println(num_one + num_two);
        } else if (action == '-') {
            System.out.println(num_one - num_two);
        } else if (action == '*') {
            System.out.println(num_one * num_two);
        } else if (action == '/') {

            double divide = (double) num_one / num_two;

            System.out.println(divide);
        } else if (action == '^') {
            System.out.println(Math.pow(num_one, num_two));
        } else {
            System.out.println("Niger");
        }
    }
}
