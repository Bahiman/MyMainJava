package Classwork8;

import java.io.*;

public class Classwork8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean is_on = true;

        System.out.println("Enter the name of the file");

        String nof = reader.readLine();

        File file = new File(String.format("src/Classwork8/%s", nof));

        if (file.createNewFile()) {
            System.out.println("File was successfully created");
        } else {
            System.out.println("File was already created");
        }

        while (is_on) {
            System.out.println("Enter the names");

            String names = reader.readLine();

            if (names.equalsIgnoreCase("stop")) {
                is_on = false;
            } else if (!names.split("/n").equals("")) {
                names = names.split("/n")[0];
                String next_name = names.split("/n")[1];
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(names);
                fileWriter.append("\n");
                fileWriter.append(next_name);
                fileWriter.flush();
            } else {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(names);
                fileWriter.append("\n");
                fileWriter.flush();
            }

        }

        reader.close();



    }

}
