package Homework_2;

public class Homework_2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0; i<10; i++){
            arr[i] = niger();
            System.out.println(arr[i] + " Testing");
            if(arr[i] > 100){
                System.out.println(arr[i] + " Is higher than hundred");
            }
        }
    }

    private static int niger(){
        return (int) (Math.random() *200 + 10);
    }
}
