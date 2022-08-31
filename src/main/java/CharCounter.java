import java.util.Map;
import java.util.TreeMap;

public class CharCounter {

    public void countOfUniqueCharacters(final String line) {
        final Map<Character, Integer> treeMap = new TreeMap<>();
        int value;
        char letter;

        for (int i = 0; i < line.length(); i++) {
            letter = line.charAt(i);
            if (!treeMap.containsKey(letter))
                treeMap.put(letter, 1);
            else {
                value = treeMap.get(letter);
                treeMap.put(letter, ++value);
            }
        }

        printInfo(treeMap);
    }

    public void printInfo(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
        }
    }
}
