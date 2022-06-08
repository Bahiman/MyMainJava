package Classwork10;

import Homework13.Niger;

public class Main {
    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        Nigerss niger = (num1, num) -> System.out.println(num1 - num);

        niger.formula(b,a);

        niger.formula(a,b);;
    }
}
