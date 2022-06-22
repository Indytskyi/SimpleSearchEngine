package search;

import java.util.*;


public class MapFinder {
    private final List<String> peopleData;
    private final Map<String, ArrayList<Integer>> wordOfPersons = new TreeMap<>();

    public MapFinder(List<String> peopleData) {
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

    public Map<String, ArrayList<Integer>> getWordOfPersons() {
        return wordOfPersons;
    }
}
