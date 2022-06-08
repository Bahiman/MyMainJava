package Homework14;

import java.util.*;

public class Homework14 {
    public static void main(String[] args) {
        List<Integer> niger = new ArrayList<>();

        List<Integer> nigers = new ArrayList<>();

        Scanner niger1 = new Scanner(System.in);

        System.out.println("Enter the first number");

        Integer one = niger1.nextInt();

        System.out.println("Enter the second number");

        Integer two = niger1.nextInt();

        System.out.println("Enter the the third number");

        Integer three = niger1.nextInt();

        System.out.println("Enter the fourth number");

        Integer four = niger1.nextInt();

        System.out.println("Enter the fifth number ");

        Integer five = niger1.nextInt();

        niger.add(one);

        niger.add(two);

        niger.add(three);

        niger.add(four);

        niger.add(five);

        nigers = niger.stream().map(x -> x*x).toList();

        System.out.println(nigers);

        List<Double> doubles = Arrays.asList(Math.floor(Integer()),Math.floor(Integer()),Math.floor(Integer()),Math.floor(Integer()),Math.floor(Integer()));

        System.out.println(doubles);

        Collections.reverse(doubles);

        System.out.println(doubles);

    }

    public static double Integer(){
        return Math.random() * 60 + 5;
    }

}