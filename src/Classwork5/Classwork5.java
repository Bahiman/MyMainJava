package Classwork5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Classwork5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        HashSet<String> hashSet = new HashSet<>();

        HashMap<String, String> hashmap;
        hashmap = new HashMap<>();

        arrayList.add("Niger");

        System.out.println(arrayList);

        hashSet.add("Niger_three_two_one");

        hashSet.add("Three nigers in the boat");

        System.out.println(Arrays.toString(hashSet.toArray()));

        hashmap.put("Bahram", "Nigers4life");

        System.out.println(hashmap.values());
    }
}
