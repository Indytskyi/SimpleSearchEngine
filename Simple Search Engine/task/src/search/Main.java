package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> peopleData = new ArrayList<>();

    public static void menu() {
        MapFinder mapFinder = new MapFinder(peopleData);
        while (true) {
            System.out.println("\n=== Menu ===\n" +
                    "1. Find a person\n" +
                    "2. Print all people\n" +
                    "0. Exit");
            int controller;
            String controllerString = scanner.nextLine();
            if (!controllerString.matches("[0-2]")) {
                System.out.println("Incorrect option! Try again.");
                continue;
            } else {
                controller = Integer.parseInt(controllerString);
            }
            switch (controller) {
                case 1:
                    System.out.println("\nEnter a name or email to search all suitable people.");
                    mapFinder.findPerson();
                    break;
                case 2:
                    printAllPerson();
                    break;
                case 0:
                    System.out.println("\nBye!");
                    return;
            }
        }
    }

    public static void printAllPerson() {
        System.out.println("\n=== List of people ===");
        peopleData.forEach(System.out::println);
    }

    public static void main(String[] args) {
        File file = new File(args[1]);
        try (Scanner scanner1 = new Scanner(file)){
            while (scanner1.hasNext()) {
                peopleData.add(scanner1.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        menu();
    }
}
