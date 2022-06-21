package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface TypeOfSearch {

    void search( Map<String, ArrayList<Integer>> wordOfPersons);

    void view(ArrayList<String> peopleData);
}
