package OOP.Task01.bean;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program can create real files and directories");


        System.out.println("Create Directory:" + "\nEnter DirectoryPath with filename" + "\n Example to create 'alexWantToBeGoodStudent' : 'c://alexWantToBeGoodStudent'");
        String directoryPath = sc.next();

        FileDirectory fileDirectory = new FileDirectory(directoryPath);
        if (!fileDirectory.exists()) {
            if (fileDirectory.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }
        System.out.println(fileDirectory.getPath());

        System.out.println("Enter File Name");
        String fileName = sc.next();

        TextFile textFile = new TextFile(fileDirectory.getPath() + "/" + fileName);
        try {
            boolean created = textFile.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        }
        System.out.println(textFile.getPath());

        System.out.println("Enter what you want to add to your file");
        try {
            FileWriter writer = new FileWriter(textFile.getPath(), true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(sc.next());
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }


        boolean isComplete = false;
        while (isComplete == false) {
            System.out.println("Chose if you want delete your file" +
                    "\n 1. if You want delete your file" +
                    "\n 2. if you don't want delete your file");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Chose if you want delete your file" +
                        "\n 1. if You want delete your file" +
                        "\n 2. if you don't want delete your file");
            }
            int firstChoice = sc.nextInt();

            switch (firstChoice) {
                case 1:
                    textFile.delete();
                    isComplete = true;
                    break;
                case 2:
                    isComplete = true;
                    break;
            }
        }

    }

}
