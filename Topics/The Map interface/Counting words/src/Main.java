import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        // write your code here
        SortedMap<String, Integer> result = new TreeMap<>();
        for (String t : strings) {
            Integer c = result.get(t);
            result.put(t, (c == null) ? 1 : c + 1);
        }

        return result;
    }

    public static void printMap(Map<String, Integer> map) {
        // write your code here
        for (Map.Entry m : map.entrySet()) {
            System.out.println(  m.getKey() + " : " + m.getValue());
        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}