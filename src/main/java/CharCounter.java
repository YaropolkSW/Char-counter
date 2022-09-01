import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    private final Cache cache;

    public CharCounter(Cache cache) {
        this.cache = cache;
    }

    public Map<Character, Integer> countOfUniqueCharacters(final String line) {
        final Map<Character, Integer> countOfCharacters = new HashMap<>();
        int value;

        if (cache.contains(line)) {
            return cache.getValue(line);
        }

        for (final char letter : line.toCharArray()) {
            if (!countOfCharacters.containsKey(letter))
                countOfCharacters.put(letter, 1);
            else {
                value = countOfCharacters.get(letter);
                countOfCharacters.put(letter, ++value);
            }
        }

        cache.putData(line, countOfCharacters);

        return countOfCharacters;
    }

}
