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
        System.out.println("Enter the number of people:");
        int numberOfPeople = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter all people:");
        addingPeople(numberOfPeople);

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
                    searchingPeople();
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

    public static void addingPeople(int numberOfPeople) {
        for (int i = 0; i < numberOfPeople; i++) {
            peopleData.add(scanner.nextLine());
        }
    }

    public static void printAllPerson() {
        System.out.println("\n=== List of people ===");
        peopleData.forEach(System.out::println);
    }


    public static void searchingPeople() {
        LinkedHashSet<String> foundPeople = new LinkedHashSet<>();
        String inputPeople = scanner.nextLine().trim();
        for (String person : peopleData) {
            if (person.toLowerCase().contains(inputPeople.toLowerCase())) {
                foundPeople.add(person);
            }
        }
        if (foundPeople.size() == 0) {
            System.out.println("No matching people found.");
        } else {
            foundPeople.forEach(System.out::println);
        }
        foundPeople.clear();
    }

    public static void main(String[] args) {
        menu();
    }
}
