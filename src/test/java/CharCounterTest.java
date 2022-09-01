import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CharCounterTest {
    private final Cache cache = new Cache();
    private final CharCounter charCounter = new CharCounter(cache);

    @Test
    public void shouldContainOnlyUniqueLetters() {
        final Map<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('e', 1);
        expectedMap.put('h', 1);
        expectedMap.put('l', 2);
        expectedMap.put('o', 1);
        final Map<Character, Integer> resultMap = charCounter.countOfUniqueCharacters("hello");

        Assertions.assertEquals(expectedMap, resultMap);
    }
}
