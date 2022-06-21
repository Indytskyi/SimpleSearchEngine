package search;

import java.util.*;
import java.util.stream.IntStream;

public class NoneSearch implements TypeOfSearch{
    private Set<Integer> filterPeople = new LinkedHashSet<>();

    @Override
    public void search(Map<String, ArrayList<Integer>> wordOfPersons) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name or email to search none suitable people.");
        String inputData = scanner.nextLine();
        Arrays.stream(inputData.split(" ")).forEach(data -> {
            if (wordOfPersons.containsKey(data)) {
                filterPeople.addAll(wordOfPersons.get(data));
            }
        });
    }

    @Override
    public void view(ArrayList<String> peopleData) {
        ArrayList<String> people = new ArrayList<>(peopleData);
        ArrayList<String> removePeople = new ArrayList<>();
        filterPeople.forEach(i -> removePeople.add(peopleData.get(i)));
        people.removeAll(removePeople);
        if (people.size() == 0) {
            System.out.println("No matching people found.");
        } else {
            System.out.println(people.size() + " person found:");
            people.forEach(i -> System.out.println(i));
        }
    }
}
