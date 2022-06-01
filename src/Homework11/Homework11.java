package Homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Homework11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Add, Subtract, Multiply, Divide");

            String choice = bufferedReader.readLine();

            switch (choice) {
                case "+" -> {
                    try {
                        System.out.println("Enter the number a");
                        int a = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter the number b");
                        int b = Integer.parseInt(bufferedReader.readLine());

                        add(a, b);
                    } catch (InputMismatchException | NumberFormatException ime) {
                        ime.printStackTrace();
                    }
                }
                case "-" -> {

                    try {
                        System.out.println("Enter the number a");
                        int aa = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter the number b");
                        int bb = Integer.parseInt(bufferedReader.readLine());
                        subtract(aa, bb);
                    } catch (InputMismatchException | NumberFormatException ime) {
                        ime.printStackTrace();
                    }
                }
                case "/" -> {

                    try {
                        System.out.println("Enter the number a");
                        int aaa = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter the number b");
                        int bbb = Integer.parseInt(bufferedReader.readLine());
                        divide(aaa, bbb);
                    } catch (InputMismatchException | NumberFormatException | ArithmeticException ime) {
                        ime.printStackTrace();
                    }
                }
                case "*" -> {
                    try {
                        System.out.println("Enter the number a");
                        int aaaa = Integer.parseInt(bufferedReader.readLine());
                        System.out.println("Enter the number b");
                        int bbbb = Integer.parseInt(bufferedReader.readLine());
                        multiply(aaaa, bbbb);
                    } catch (InputMismatchException | NumberFormatException ime) {
                        ime.printStackTrace();
                    }
                }
            }
        }
    }

    public static void add(int a, int b) throws InputMismatchException {

        double niger = a + b;

        System.out.println(niger);
    }

    public static void subtract(int a, int b) throws InputMismatchException {

        double niger = a - b;

        System.out.println(niger);
    }

    public static void divide(int a, int b) throws ArithmeticException, InputMismatchException {

        double niger = a / b;

        System.out.println(niger);
    }

    public static void multiply(int a, int b) throws InputMismatchException {

        double niger = a * b;

        System.out.println(niger);
    }
}
