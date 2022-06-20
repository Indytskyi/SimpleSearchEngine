package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> peopleData = new ArrayList<>();

    public static void findWord() {
        String stringInput = scanner.nextLine();
        String[] stringArray = stringInput.split(" ");
        String currentWord = scanner.nextLine();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(currentWord)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void menu() {
        System.out.println("Enter the number of people:");
        int numberOfPeople = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter all people:");
        addingPeople(numberOfPeople);

        System.out.println("\nEnter data to search queries:");
        int numberOfSearchPeople = Integer.valueOf(scanner.nextLine());
        searchingPeople(numberOfSearchPeople);
    }

    public static void addingPeople(int numberOfPeople) {
        for (int i = 0; i < numberOfPeople; i++) {
            peopleData.add(scanner.nextLine());
        }
    }



    public static void searchingPeople(int numberOfSearchPeople) {
        LinkedHashSet<String> foundPeople = new LinkedHashSet<>();

        for (int i = 0; i < numberOfSearchPeople; i++) {
            System.out.println("\nEnter data to search people:");
            String inputPeople = scanner.nextLine().trim();
//            foundPeople = new LinkedHashSet<>(peopleData.stream()
//                    .filter(person -> person.toLowerCase().equals(inputPeople.toLowerCase()))
//                    .collect(Collectors.toSet()));
            for (String person : peopleData) {
//                String[] dataOfPerson = person.toLowerCase().split(" ");
//                if (Arrays.stream(dataOfPerson).
//                        anyMatch(data -> data.toLowerCase().equals(inputPeople.toLowerCase()))) {
//                    foundPeople.add(person);
//                }
                if (person.toLowerCase().contains(inputPeople.toLowerCase())) {
                    foundPeople.add(person);
                }

            }

            if (foundPeople.size() == 0) {
                System.out.println("No matching people found.");
            } else {
                System.out.println("\nFound people:");

                foundPeople.stream().forEach(p -> System.out.println(p));
            }
            foundPeople.clear();
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
