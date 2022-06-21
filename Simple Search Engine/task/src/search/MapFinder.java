package search;

import java.util.*;

import static search.Main.scanner;

public class MapFinder {
    private  ArrayList<String> peopleData;
    private  Map<String, ArrayList<Integer>> wordOfPersons = new TreeMap<>();

    public MapFinder(ArrayList<String> peopleData) {
        this.peopleData = peopleData;
        fillingMap();
    }

    void fillingMap() {
        for (int i = 0; i < peopleData.size(); i++) {
            String[] personData = peopleData.get(i).toLowerCase().split(" ");
            for (String data: personData) {
                if (!wordOfPersons.containsKey(data)) {
                    wordOfPersons.put(data, new ArrayList<>(List.of(i)));
                } else {
                    wordOfPersons.get(data).add(i);
                }
            }
        }
    }

//    void findPerson() {
//        String inputPeople = scanner.nextLine().trim().toLowerCase();
//        if (wordOfPersons.containsKey(inputPeople)) {
//            ArrayList<Integer> foundPeople = wordOfPersons.get(inputPeople);
//            System.out.println(foundPeople.size() + " person found:");
//            foundPeople.forEach(i -> System.out.println(peopleData.get(i)));
//        } else {
//            System.out.println("No matching people found.");
//        }
//    }


    public Map<String, ArrayList<Integer>> getWordOfPersons() {
        return wordOfPersons;
    }
}
