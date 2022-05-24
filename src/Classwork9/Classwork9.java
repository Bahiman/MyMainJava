package Classwork9;

import java.io.*;
import java.util.*;

public class Classwork9 {
    public static void main(String[] args) throws IOException {

        boolean is_on = true;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the file");

        String file_name = input.readLine();

        File myObj = new File("C:\\Users\\bahge\\IdeaProjects\\MyMainJava\\src\\Classwork9\\" + file_name);

        ArrayList<String> list = new ArrayList<String>();

        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        while (is_on) {
            FileWriter niger = new FileWriter(myObj, true);

            System.out.println("Enter the edits which you wanna make to the file");

            String edits1 = null;

            if (edits1 == null) {
                edits1 = input.readLine();
            } else {
                System.out.println("Falling");
            }

            list.add(edits1);

            if (edits1.equalsIgnoreCase("stop")) {
                is_on = false;
            } else if (edits1.equalsIgnoreCase("show")) {

                FileReader fileReader = new FileReader(myObj);

                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String nigerosa = "";

                while ((nigerosa = bufferedReader.readLine()) != null) {
                    System.out.println(nigerosa);
                }

            } else if (edits1.equalsIgnoreCase("delete")) {

                System.out.println("Enter the name of the data");

                String ladygaga = input.readLine();

                FileReader fileReader2 = new FileReader(myObj);

                BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

                String nigerosa = "";

                while ((nigerosa = bufferedReader2.readLine()) != null) {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(ladygaga)) {
                            list.remove(i);
                            delete(list, niger);
                        }
                    }
                }


            } else if (edits1.equalsIgnoreCase("execute")) {
                delete(list, niger);
                System.out.println("executed!");

            } else {

                System.out.println("Enter the edits which you wanna make to the file");
                final String editsd = input.readLine();

                edits1 = editsd;

                list.add(edits1);
            }
        }


    }

    public static void delete(ArrayList<String> list, FileWriter niger) throws IOException {
        for (String x : list) {
            niger.append(x);

            niger.append("\n");

            niger.flush();
        }
    }
}
