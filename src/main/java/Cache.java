import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final Map<String, Map<Character, Integer>> cache = new HashMap<>();

    public boolean isLineSame(final String line) {
        return cache.containsKey(line);
    }

    public Map<Character, Integer> getValue(final String line) {
        return cache.get(line);
    }

    public void putData(final String line, final Map<Character, Integer> map) {
        cache.put(line, map);
    }
}
