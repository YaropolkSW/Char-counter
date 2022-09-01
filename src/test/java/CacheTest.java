import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CacheTest {
    private final Cache cache = new Cache();
    private final CharCounter charCounter = new CharCounter(cache);

    @Test
    public void shouldCashResults() {
        final String hello = "hello";

        charCounter.countOfUniqueCharacters(hello);
        Assertions.assertTrue(cache.contains(hello));
    }
}
