package search;

import java.util.*;

public class AllSearch implements TypeOfSearch{
    private ArrayList<Integer> filterPeople = new ArrayList<>();

    @Override
    public void search(Map<String, ArrayList<Integer>> wordOfPersons) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name or email to search all suitable people.");
        String inputData = scanner.nextLine();
        int counter = 0;
        for (String data: inputData.split(" ")) {
            if (wordOfPersons.containsKey(data)) {
                if (counter == 0) {
                    filterPeople.addAll(wordOfPersons.get(data));
                } else {
                    filterPeople.retainAll(wordOfPersons.get(data));
                }
                counter++;
            }
        }
    }

    @Override
    public void view(ArrayList<String> peopleData) {

        if (filterPeople.size() == 0) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(filterPeople.size() + " person found:");
            filterPeople.forEach(i -> System.out.println(peopleData.get(i)));
        }
    }
}
