package Classwork4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> production = new HashSet<Product>();

        boolean is_on = true;

        Scanner input = new Scanner(System.in);

        while (is_on) {


            System.out.println("Enter name");
            String name = input.next();


            if (name.equals("stop")) {
                is_on = false;

                System.out.println(production);

            } else {

                System.out.println("Enter price");
                int price = input.nextInt();

                Product product_one = new Product(
                        name,
                        price
                );

                production.add(product_one);

                System.out.println(production);
            }
        }

    }
}
