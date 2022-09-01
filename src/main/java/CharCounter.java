import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCounter {
    private static final Map<String, Map<Character, Integer>> cash = new HashMap<>();

    public Map<Character, Integer> countOfUniqueCharacters(final String line) {
        Map<Character, Integer> treeMap = new TreeMap<>();
        int value;
        char letter;

        if (isLineSame(line)) {
            treeMap = cash.get(line);
            printInfo(line, treeMap);
            return treeMap;
        }

        for (int i = 0; i < line.length(); i++) {
            letter = line.charAt(i);
            if (!treeMap.containsKey(letter))
                treeMap.put(letter, 1);
            else {
                value = treeMap.get(letter);
                treeMap.put(letter, ++value);
            }
        }

        cash.put(line, treeMap);

        return treeMap;
    }

    public void printInfo(final String line, final Map<Character, Integer> map) {
        System.out.println(line);
        for (final Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
        }
    }

    public boolean isLineSame(final String line) {
        return cash.containsKey(line);
    }
}
