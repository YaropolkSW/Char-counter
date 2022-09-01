import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Map;
import java.util.TreeMap;

public class CharCounterTest {
    private final CharCounter cc = new CharCounter();

    @Test
    public void shouldContainOnlyUniqueLetters() {
        final Map<Character, Integer> expectedMap = new TreeMap<>();
        expectedMap.put('e', 1);
        expectedMap.put('h', 1);
        expectedMap.put('l', 2);
        expectedMap.put('o', 1);
        final Map<Character, Integer> resultMap = cc.countOfUniqueCharacters("hello");

        Assertions.assertEquals(expectedMap, resultMap);
    }

    @Test
    @Timeout(1000)
    public void shouldWorkFasterThanOneSecond() {
        final String hello = "hello";

        cc.countOfUniqueCharacters(hello);
    }

    @Test
    public void shouldCashResults() {
        final String hello = "hello";

        cc.countOfUniqueCharacters(hello);
        Assertions.assertTrue(cc.isLineSame(hello));
    }
}
