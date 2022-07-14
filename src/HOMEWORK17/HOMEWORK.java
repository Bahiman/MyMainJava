package HOMEWORK17;

import java.util.Scanner;

public class HOMEWORK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fact = 1;

        int number = scanner.nextInt();
            
        if(number == 0){
            System.out.println("Invalid number");
        } else if (number < 0) {
            
        }
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
