package Homework10;

import java.io.*;
import java.util.ArrayList;

public class Homework10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the file");

        String file_name = bufferedReader.readLine();

        File file = new File(String.format("src/Homework10/%s.txt", file_name));

        boolean is_on = true;


        if (file.createNewFile()) {
            System.out.println("File was created: " + file.getName());
        } else {
            System.out.println("File with this name already exists");
        }

        while (is_on) {
            System.out.println("Add:1; Get:2; Delete:3; Exit:0");

            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1 ->
                    // ADD
                        addData(file_name);
                case 2 -> {
                    // GET
                    System.out.println("-------------");
                    getData(file_name);
                    System.out.println("-------------");
                }
                case 3 ->
                    // DELETE
                        deleteData(file_name);
                case 0 -> {
                    // EXIT
                    System.out.println("Exiting");
                    is_on = false;
                    System.out.println("Exited");
                }
                default -> System.out.println("Something went wrong");
            }
        }
    }

    public static void addData(String file_name) throws IOException {
        System.out.println("Enter the name of the country: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String country = bufferedReader.readLine();

        System.out.println("Enter your name");

        String name = bufferedReader.readLine();

        File file = new File(String.format("src/Homework10/%s.txt", file_name));

        FileWriter fileWriter = new FileWriter(file, true);

        String dataToSave = String.format("Name: %s --- Country: %s ", name, country);


        fileWriter.write("Name: " + name + " Country: " + country);

        fileWriter.append("\n");

        fileWriter.flush();

    }

    public static void getData(String file_name) throws IOException {
        System.out.println("Getting the data");

        File file = new File(String.format("src/Homework10/%s.txt", file_name));

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true) {
            String text = bufferedReader.readLine();

            if (text == null) {
                break;
            } else {
                System.out.println(text);
            }
        }

        System.out.println();
    }

    public static void deleteData(String file_name) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the index of the element which you wanna delete");

        String index = String.valueOf(Integer.parseInt(reader.readLine()));

        ArrayList<String> dataFromFile = new ArrayList<>();

        File file = new File(String.format("src/Homework10/%s.txt", file_name));

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);


        while (true) {
            String text = bufferedReader.readLine();

            if (text == null) {
                break;
            } else {
                dataFromFile.add(text);
            }
        }

            dataFromFile.remove(Integer.parseInt(index) - 1);

            FileWriter fileWriter = new FileWriter(file, false);

            for(String text1: dataFromFile){

                fileWriter.write(text1);

                fileWriter.append("\n");

                fileWriter.flush();
            }

            fileWriter.append("\n");

            fileWriter.flush();

    }
}
