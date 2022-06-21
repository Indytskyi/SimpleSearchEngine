package search;

import java.util.*;

public class AnySearch implements TypeOfSearch{
    private Set<Integer> filterPeople = new LinkedHashSet<>();

    @Override
    public void search(Map<String, ArrayList<Integer>> wordOfPersons) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name or email to search any suitable people.");
        String inputData = scanner.nextLine();
        Arrays.stream(inputData.split(" ")).forEach(data -> {
            if (wordOfPersons.containsKey(data)) {
              filterPeople.addAll(wordOfPersons.get(data));
            }
        });
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
