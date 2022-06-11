package Homework15;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> integerList = null;

        ArrayList<String> strings = new ArrayList<>();

        ArrayList<LocalDate> localDates = new ArrayList<>();

        int counter = 0;

        int i = 0;

        try {
            for (int b = 1; b < 4; b++) {

                integerList = new ArrayList<>();

                System.out.println("Enter the info");

                String info = bufferedReader.readLine();

                strings.add(info);

                for (i = 1; i < 4; i++) {
                    System.out.println("Enter the date: " + i);

                    int date = Integer.parseInt(bufferedReader.readLine());

                    integerList.add(date);
                }
                LocalDate localDate = LocalDate.of(integerList.get(0), integerList.get(1), integerList.get(2));

                localDates.add(localDate);

                integerList = null;

            }

            Collections.sort(localDates);

            for (LocalDate x : localDates) {

                System.out.println(x + ": ");


                System.out.println(strings.get(counter));

                counter++;
            }


        } catch (IOException | IndexOutOfBoundsException | InputMismatchException | ArithmeticException |
                 NumberFormatException e) {
            e.printStackTrace();
        }


    }
}
