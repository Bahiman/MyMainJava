package Classwork7;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Creator {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the file");

        String file_name = input.next();

        File myObj = new File("C:\\Users\\bahge\\IdeaProjects\\MyMainJava\\src\\Classwork7\\" + file_name);


        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }

        FileWriter niger = new FileWriter("C:\\Users\\bahge\\IdeaProjects\\MyMainJava\\src\\Classwork7\\" + file_name);


        System.out.println("Enter the edits which you wanna make to the file");

        niger.write("Niger");

        niger.close();
    }
}
