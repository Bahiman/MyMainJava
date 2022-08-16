package Classwork_2;

import java.util.Arrays;
import java.util.Collections;

public class Task_one {
    public static void main(String[] args) {
        Integer[] array = new Integer[20];

        for (int a = 0; a < array.length; a++) {
            array[a] = niger();
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }



//        System.out.println(max);
//
//        Arrays.stream(array).sorted();
//
//        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));

    }

    private static int niger() {
        return (int) (Math.random() * 235 + 40);
    }
}
