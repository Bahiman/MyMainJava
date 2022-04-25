package Homework3;

import groovy.console.ui.ScriptToTreeNodeAdapter;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {

        ArrayList<Integer> noel = new ArrayList<>();

        boolean stopped = false;

        Scanner scanner = new Scanner(System.in);

        String number_one = scanner.nextLine();

        if (number_one.toLowerCase(Locale.ROOT).equals("stopped")) {
            stopped = true;

        } else {
            noel.add(Integer.valueOf(number_one));
            System.out.println(noel.get(0));
            System.out.println(noel.stream().toArray());
        }

        String number_two = scanner.nextLine();

        if (number_two.toLowerCase(Locale.ROOT).equals("stopped")) {
            stopped = true;
        } else {
            noel.add(Integer.valueOf(number_two));
        }

        String number_three = scanner.nextLine();

        if (number_three.toLowerCase(Locale.ROOT).equals("stopped")) {
            stopped = true;
        } else {
            noel.add(Integer.valueOf(number_three));
        }

        String number_four = scanner.nextLine();

        if (number_one.toLowerCase(Locale.ROOT).equals("stopped")) {
            stopped = true;
        } else {
            noel.add(Integer.valueOf(number_four));
        }

        String number_five = scanner.nextLine();

        if (number_five.toLowerCase(Locale.ROOT).equals("stopped")) {
            stopped = true;
        } else {
            noel.add(Integer.valueOf(number_five));
        }

        if (stopped == true) {
            for (int b = noel.toArray().length; b <= 0; b--) {
                System.out.println(noel.get(b));
            }
        } else if (noel.get(4) != 0) {
            for (int b = noel.toArray().length; b <= 0; b--) {
                System.out.println(noel.get(b));
            }
        }

        System.out.println("Niger");
    }
}
