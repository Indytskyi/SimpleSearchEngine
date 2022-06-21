package search;

import java.util.ArrayList;
import java.util.Map;

public class FindPerson {
    private TypeOfSearch typeOfSearch;

    public void setTypeOfSearch(TypeOfSearch typeOfSearch) {
        this.typeOfSearch = typeOfSearch;
    }

    public void search(Map<String, ArrayList<Integer>> wordOfPersons) {
        this.typeOfSearch.search(wordOfPersons);
    }

    void view(ArrayList<String> peopleData) {
        this.typeOfSearch.view(peopleData);
    }
}
