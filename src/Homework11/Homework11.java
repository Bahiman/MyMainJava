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
                case "+":
                    System.out.println("Enter the number a");

                    int a = Integer.parseInt(bufferedReader.readLine());

                    System.out.println("Enter the number b");

                    int b = Integer.parseInt(bufferedReader.readLine());

                    try {
                        add(a, b);
                    } catch (InputMismatchException ime) {
                        ime.printStackTrace();
                    }
                    break;

                case "-":
                    System.out.println("Enter the number a");

                    int aa = Integer.parseInt(bufferedReader.readLine());

                    System.out.println("Enter the number b");

                    int bb = Integer.parseInt(bufferedReader.readLine());

                    try {
                        subtract(aa, bb);
                    } catch (InputMismatchException ime) {
                        ime.printStackTrace();
                    }

                    break;

                case "/":
                    System.out.println("Enter the number a");

                    int aaa= Integer.parseInt(bufferedReader.readLine());

                    System.out.println("Enter the number b");

                    int bbb = Integer.parseInt(bufferedReader.readLine());

                    try{
                        divide(aaa,bbb);
                    } catch (InputMismatchException ime){
                        ime.printStackTrace();
                    } catch (ArithmeticException ae){
                        ae.printStackTrace();
                    }

                    break;

                case "*":
                    System.out.println("Enter the number a");

                    int aaaa= Integer.parseInt(bufferedReader.readLine());

                    System.out.println("Enter the number b");

                    int bbbb = Integer.parseInt(bufferedReader.readLine());

                    try {
                        multiply(aaaa,bbbb);
                    } catch (InputMismatchException ime){
                        ime.printStackTrace();
                    }


            }
        }
    }

    public static void add(int a, int b) throws InputMismatchException{
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) throws InputMismatchException {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) throws ArithmeticException, InputMismatchException{
        System.out.println(a/b);
    }

    public static void multiply(int a, int b) throws InputMismatchException{
        System.out.println(a*b);
    }
}
