package Homework_1;

public class Main {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 200 + 50);

        System.out.println(random);

        Sub.task_one();

        Sub.task_two();

        Info info_one = new Info("name", "33", "Hasan Salmani");
        System.out.println(info_one);

        double retro = Math.pow(9, 3);

        System.out.println(retro);

        int[] niger = {5,8,9};


    }
}
