import java.util.HashMap;
import java.util.Map;

public class CharCounter {

    public Map<Character, Integer> countOfUniqueCharacters(final String line) {
        Cache cache = new Cache();
        Map<Character, Integer> countOfCharacters = new HashMap<>();
        int value;

        if (cache.isLineSame(line)) {
            countOfCharacters = cache.getValue(line);
            return countOfCharacters;
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
