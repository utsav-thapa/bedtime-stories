package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
        What story do you wanna read?
        1. Goldilocks
        2. Hansel and Gretel
        3. Mary had a little lamb""");
        try {
            Scanner scanners = new Scanner(System.in);
            String userInput = scanners.nextLine();
            String goldilocks ="src/main/resources/goldilocks.txt" ;
            String hanselAndGretel ="src/main/resources/hansel_and_gretel.txt" ;
            String maryAndLamb ="src/main/resources/mary_had_a_little_lamb.txt" ;
            String filepath;
            if (userInput.equals("goldilocks")) {
                filepath = goldilocks;
            } else if (userInput.equals("hansel and gretel")) {
                filepath = hanselAndGretel;
            } else if(userInput.equals("mary had a little lamb")) {
                filepath = maryAndLamb;
            }
            scanners.close();
            Scanner scanner = new Scanner(new File("src/main/resources/goldilocks.txt"));
            String line = "";
            int lineCount = 1;
            while (scanner.hasNext()) {
                line = scanner.nextLine();
                System.out.println(lineCount + ".\t \t " + line);
                lineCount++;

            }

        } catch (FileNotFoundException e) {
            System.out.println("I couldn't find that file.");
        }

    }


}